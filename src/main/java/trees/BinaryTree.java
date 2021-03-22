package trees;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BinaryTree {

    private TreeNode root;
    public BinaryTree() {}

    public BinaryTree(Integer[] array) {
        root = insertNode(array, root, 0);
    }

    public int getMaxDepth() {
        if (root == null) return 0;
        return getDepth(root, 0);
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

    public Integer[] toArray() {
        ArrayList<Integer> res = new ArrayList<>();
        putInOrder(res, root);
        return res.toArray(Integer[]::new);
    }

    private void putInOrder(ArrayList<Integer> list, TreeNode node) {
        if (node != null) {
            list.add(node.val);
            putInOrder(list, node.left);
            putInOrder(list, node.right);
        }
    }

    private static class TreeNode {
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
  }
}
