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
}
