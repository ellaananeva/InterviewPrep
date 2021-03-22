package trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {
    @Test
    @DisplayName("Test create from array and to array")
    public void testCreateBinaryTree() {
        Integer[] input = {5, 1, 3, 6, 4, 8};
        BinaryTree tree = new BinaryTree(input);
        Assertions.assertArrayEquals(input, tree.toArray(), "Binary tree works");

    }
}
