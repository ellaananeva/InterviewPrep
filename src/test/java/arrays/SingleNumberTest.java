package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SingleNumberTest {
    private DuplicatesManager duplicatesManager;

    @BeforeEach
    public void setUp() throws Exception {
        duplicatesManager = new DuplicatesManager();
    }

    @Test
    @DisplayName("Get Single Number Default")
    public void testSingleNumberDefault() {
        int[] array = new int[] {0, 2, 3, 2, 1, 0, 1};
        assertEquals(3, duplicatesManager.findSingleNumberSorted(array),
                "Single Number Sorted");
        assertEquals(3, duplicatesManager.findSingleNumberWithHashMap(array),
                "Single Number Map");
    }

    @Test
    @DisplayName("Get Single Number When There's None")
    public void testNoSingleNumber() {
        int[] array = new int[] {0, 2, 2, 1, 0, 1};
        assertThrows(NullPointerException.class, () -> duplicatesManager.findSingleNumberSorted(array), "No single element");
        assertThrows(NullPointerException.class, () ->duplicatesManager.findSingleNumberWithHashMap(array), "No single element");
    }

    @Test
    @DisplayName("Get single number from one-element array")
    public void testOneElement() {
        int[] array = new int[] {1};
       assertEquals(1, duplicatesManager.findSingleNumberSorted(array),
                "One element sorted");
        assertEquals(1, duplicatesManager.findSingleNumberWithHashMap(array),
               "One element map");
    }
}
