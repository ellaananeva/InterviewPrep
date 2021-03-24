package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    public void setUp() throws Exception {
        binarySearch = new BinarySearch();
    }

    @Test
    @DisplayName("Test BS default")
    public void testBSDefault() {
        int[] array = {0, 1, 12, 3, 12};
        assertEquals(2, binarySearch.getFirstTarget(array, 12));
    }

    @Test
    @DisplayName("Test BS no element")
    public void testBSNoTarget() {
        int[] array = {0, 1, 12, 3, 12};
        assertEquals(-1, binarySearch.getFirstTarget(array, -1));
    }
}
