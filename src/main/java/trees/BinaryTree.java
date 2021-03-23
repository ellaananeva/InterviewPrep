package trees;

import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class BinaryTree {

    protected TreeNode root;
    public BinaryTree() {}

    public BinaryTree(Integer[] array) {
        root = insertNode(array, root, 0);
    }

    public Integer[] toArray() {
        ArrayList<Integer> res = new ArrayList<>();
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode entry = queue.remove(0);
            res.add(entry.val);
            if (entry.left != null) queue.add(entry.left);
            if (entry.right != null) queue.add(entry.right);
        }
        return res.toArray(Integer[]::new);
    }

    public int getMaxDepth() {
        if (root == null) return 0;
        return getDepth(root, 0);
    }




    public List<List<Integer>> levelOrder() {
        if (root == null) return new ArrayList<>();
        List<TreeNodeEntry> queue = new ArrayList<>();
        queue.add(new TreeNodeEntry(1, root));
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentLevel = new ArrayList<>();
        int levelN = 1;
        while (!queue.isEmpty()) {
            TreeNodeEntry entry = queue.remove(0);
            if (entry.index >= Math.pow(2, levelN)) {
                result.add(currentLevel);
                levelN++;
                currentLevel = new ArrayList<>();
            }
            if (entry.node != null) {
                currentLevel.add(entry.node.val);
                queue.add(new TreeNodeEntry(2 * entry.index, entry.node.left));
                queue.add(new TreeNodeEntry(2 * entry.index + 1, entry.node.right));
            }
        }
        if (!currentLevel.isEmpty()) result.add(currentLevel);
        return result;
    }

    public List<List<Integer>> levelOrderV2() {
        if (root == null) return new ArrayList<>();
        List<TreeNodeEntry> queue = new ArrayList<>();
        queue.add(new TreeNodeEntry(1, root));
        Map<Integer, List<Integer>> map = new TreeMap<>();
        map.put(1, List.of(root.val));
        while (!queue.isEmpty()) {
            TreeNodeEntry entry = queue.remove(0);
            TreeNode left = entry.node.left;
            if (left != null) {
                List<Integer> nextLevel = map.computeIfAbsent(entry.index+1, i -> new ArrayList<>());
                nextLevel.add(left.val);
                queue.add(new TreeNodeEntry(entry.index + 1, left));
            }
            TreeNode right = entry.node.right;
            if (right != null) {
                List<Integer> nextLevel = map.computeIfAbsent(entry.index+1, i -> new ArrayList<>());
                nextLevel.add(right.val);
                queue.add(new TreeNodeEntry(entry.index + 1, right));
            }

        }
        return new ArrayList<>(map.values());
    }




    private int getDepth(TreeNode node, int depth) {
        if (node != null) {
            depth++;
            int left = getDepth(node.left, depth);
            int right = getDepth(node.right, depth);
            depth = Math.max(left, right);
        }
        return depth;
    }

    private TreeNode insertNode(Integer[] array, TreeNode node, int i) {
        if (i < array.length) {
            if (array[i] != null) {
                node = new TreeNode(array[i]);
                node.left = insertNode(array, node.left, 2 * i + 1);
                node.right = insertNode(array, node.right, 2 * i + 2);
            }
        }
        return node;
    }



    private static class TreeNodeEntry {
        int index;
        TreeNode node;

        TreeNodeEntry(int index, TreeNode node) {
            this.index = index;
            this.node = node;
        }
    }

    protected static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

        public int getVal() {
            return val;
        }
    }
}
