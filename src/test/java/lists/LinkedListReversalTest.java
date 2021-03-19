package lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LinkedListReversalTest {


    @Test
    @DisplayName("Test linkedlist reversal default")
    public void testReverseDefault() {
        int[] input = {5, 1, 3, 6, 4, 8};
        int[] output = {8, 4, 6, 3, 1, 5};
        LinkedList list = new LinkedList(input);
        list.reverse();

        Assertions.assertArrayEquals(output, list.toArray(), "default reversal works");

    }
}
