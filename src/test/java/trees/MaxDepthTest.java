package trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxDepthTest {


    @Test
    @DisplayName("Get max depth with some nulls")
    public void testDefaultMaxDepth() {
        Integer[] array = new Integer[]{3,9,20,null,null,15,7};
        BinaryTree binaryTree = new BinaryTree(array);
        assertEquals(3, binaryTree.getMaxDepth(),
                "Default max depth works");
    }

    @Test
    @DisplayName("Get max depth with 3 els")
    public void testMaxDepth3El() {
        Integer[] array = new Integer[]{1,null,2};
        BinaryTree binaryTree = new BinaryTree(array);
       assertEquals(2, binaryTree.getMaxDepth(),
               "Max depth works");
    }

    @Test
    @DisplayName("Get max depth with 1 root")
    public void testMaxDepthRoot() {
        Integer[] array = new Integer[]{0};
        BinaryTree binaryTree = new BinaryTree(array);
        assertEquals(1, binaryTree.getMaxDepth(),
               "Max depth works");
    }
}
