package trees;

import com.sun.source.tree.Tree;

import java.util.Arrays;

public class BinarySearchTree extends BinaryTree {

    public BinarySearchTree() {
    }


    public BinarySearchTree (Integer[] array)  {
        Arrays.sort(array);
        root = insertNode(array, 0, array.length-1);

    }

    public boolean isValid() {
        return isValid(root, null, null);
    }

    private TreeNode insertNode(Integer[] array, int minI, int maxI) {
        int i = (minI + maxI)/2;
        TreeNode node = new TreeNode(array[i]);
        if (minI < i) node.left = insertNode(array,  minI, i-1);
        if (maxI > i) node.right = insertNode(array, i+1, maxI);
        return node;
    }

    private boolean isValid(TreeNode node, Integer low, Integer high) {
        if (node == null) return true;
        boolean isValid = true;
        if (low != null) isValid = node.val < low;
        if (high != null) isValid &= node.val > high;
        isValid &= isValid(node.left, node.val, high) && isValid(node.right, low, node.val);
        return isValid;
    }
}
