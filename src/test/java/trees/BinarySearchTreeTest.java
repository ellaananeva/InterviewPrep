package trees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    @Test
    @DisplayName("Test BST default")
    public void testDefaultBST() {
        Integer[] array = new Integer[]{2,1,3};
        BinaryTree binaryTree = new BinaryTree(array);
        assertTrue(binaryTree.isBinarySearchTree());
    }

    @Test
    @DisplayName("Test no BST default")
    public void testDefaultNoBST() {
        Integer[] array = new Integer[]{5,1,4,null,null,3,6};
        BinaryTree binaryTree = new BinaryTree(array);
        assertFalse(binaryTree.isBinarySearchTree());
    }

    @Test
    @DisplayName("Test no BST ")
    public void testNoBST() {
        Integer[] array = new Integer[]{5,4,6,null,null,3,7};
        BinaryTree binaryTree = new BinaryTree(array);
        assertFalse(binaryTree.isBinarySearchTree());
    }
}
