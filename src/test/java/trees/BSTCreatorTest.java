package trees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BSTCreatorTest {
    @Test
    @DisplayName("Test no BST default")
    public void testDefaultNoBST() {
        Integer[] array = new Integer[]{-10,-3,0,5,9};
        BinarySearchTree binaryTree = new BinarySearchTree(array);
        assertTrue(binaryTree.isValid());
        assertArrayEquals(new Integer[]{0,-3,9,-10,5}, binaryTree.toArray());
    }


}
