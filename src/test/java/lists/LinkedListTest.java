package lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    @DisplayName("Test create from array and to array")
    public void testCreateList() {
        int[] input = {5, 1, 3, 6, 4, 8};
        LinkedList list = new LinkedList(input);
        Assertions.assertArrayEquals(input, list.toArray(), "LinkedList works");

    }

    @Test
    @DisplayName("Test linkedlist reversal default")
    public void testReverseDefault() {
        int[] input = {5, 1, 3, 6, 4, 8};
        int[] output = {8, 4, 6, 3, 1, 5};
        LinkedList list = new LinkedList(input);
        list.reverse();

        Assertions.assertArrayEquals(output, list.toArray(), "default reversal works");

    }

    @Test
    @DisplayName("Test merge linkedlist default")
    public void testMergeDefault() {
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinkedList listA = new LinkedList(new int[]{1, 3, 5, 7, 9});
        LinkedList listB = new LinkedList(new int[] {2, 4, 6, 8, 10});

        Assertions.assertArrayEquals(result, listA.mergeSorted(listB).toArray(),  "default merge works");

    }

    @Test
    @DisplayName("Test merge linkedlist repeating")
    public void testMergeRepeating() {
        int[] result = {1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10};
        LinkedList listA = new LinkedList(new int[]{1, 3, 4, 5, 7, 9});
        LinkedList listB = new LinkedList(new int[] {1, 2, 4, 6, 8, 10});

        Assertions.assertArrayEquals(result, listA.mergeSorted(listB).toArray(),  "repeating merge works");

    }


}
