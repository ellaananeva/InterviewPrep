package trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TraverseTreeTest {
    @Test
    @DisplayName("Test traverse default")
    public void testTraverseLevelsDefault() {
        Integer[] array = new Integer[]{3,9,20,null,null,15,7};
        BinaryTree binaryTree = new BinaryTree(array);
        List<List<Integer>> levels = binaryTree.levelOrder();
        assertEquals(3, levels.size());
        assertArrayEquals(new Integer[]{3}, levels.get(0).toArray(Integer[]::new));
        assertArrayEquals(new Integer[]{9, 20}, levels.get(1).toArray(Integer[]::new));
        assertArrayEquals(new Integer[]{15, 7}, levels.get(2).toArray(Integer[]::new));

        }

    @Test
    @DisplayName("Test traverse two elements")
    public void testTraverseLevelsTwoElements() {
        Integer[] array = new Integer[]{1, 2};
        BinaryTree binaryTree = new BinaryTree(array);
        List<List<Integer>> levels = binaryTree.levelOrder();
        assertEquals(2, levels.size());
        assertArrayEquals(new Integer[]{1}, levels.get(0).toArray(Integer[]::new));
        assertArrayEquals(new Integer[]{2}, levels.get(1).toArray(Integer[]::new));

    }

    @Test
    @DisplayName("Test traverse nulls ")
    public void testTraverseLevelsNullElements() {
        Integer[] array = new Integer[]{1,2,null,3,null,4,null,5};
        BinaryTree binaryTree = new BinaryTree(array);
        List<List<Integer>> levels = binaryTree.levelOrder();
        assertEquals(4, levels.size());
        assertArrayEquals(new Integer[]{1}, levels.get(0).toArray(Integer[]::new));
        assertArrayEquals(new Integer[]{2}, levels.get(1).toArray(Integer[]::new));
        assertArrayEquals(new Integer[]{3}, levels.get(2).toArray(Integer[]::new));
        assertArrayEquals(new Integer[]{4}, levels.get(3).toArray(Integer[]::new));
        assertArrayEquals(new Integer[]{5}, levels.get(4).toArray(Integer[]::new));

    }

    @Test
    @DisplayName("Test traverse 5 elements")
    public void testTraverseLevels5Elements() {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        BinaryTree binaryTree = new BinaryTree(array);
        List<List<Integer>> levels = binaryTree.levelOrderV2();
        assertEquals(3, levels.size());
        assertArrayEquals(new Integer[]{1}, levels.get(0).toArray(Integer[]::new));
        assertArrayEquals(new Integer[]{2, 3}, levels.get(1).toArray(Integer[]::new));
        assertArrayEquals(new Integer[]{4, 5}, levels.get(2).toArray(Integer[]::new));

    }

    @Test
    @DisplayName("Test traverse 5 elements")
    public void testTraverseLevelsNElements() {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        BinaryTree binaryTree = new BinaryTree(array);
        List<List<Integer>> levels = binaryTree.levelOrder();
        assertEquals(3, levels.size());
        assertArrayEquals(new Integer[]{1}, levels.get(0).toArray(Integer[]::new));
        assertArrayEquals(new Integer[]{2, 3}, levels.get(1).toArray(Integer[]::new));
        assertArrayEquals(new Integer[]{4, 5}, levels.get(2).toArray(Integer[]::new));

    }
}

