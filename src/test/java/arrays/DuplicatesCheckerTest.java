package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class DuplicatesCheckerTest {
    private DuplicatesManager duplicatesChecker;

    @BeforeEach
    public void setUp() throws Exception {
        duplicatesChecker = new DuplicatesManager();
    }

    @Test
    @DisplayName("Duplicates checker one")
    public void testHasOneDuplicate() {
        int[] array = new int[] {0, 2, 3, 2};
        assertTrue(duplicatesChecker.hasDuplicatesHashMap(array), "Has one duplicate should work in a hash map");
        assertTrue(duplicatesChecker.hasDuplicatesSorted(array), "Has one duplicate should work in a sorted array");
    }

    @Test
    @DisplayName("Duplicates checker two")
    public void testHasTwoDuplicates() {
        int[] array = new int[] {0, 2, 3, 2, 3, 1};
        assertTrue(duplicatesChecker.hasDuplicatesHashMap(array), "Has two duplicates should work in a hash map");
        assertTrue(duplicatesChecker.hasDuplicatesSorted(array), "Has two duplicates should work in a sorted array");
    }

    @Test
    @DisplayName("Duplicates checker none")
    public void testHasNoDuplicates() {
        int[] array = new int[] {0, 2, 3, 1};
        assertFalse(duplicatesChecker.hasDuplicatesHashMap(array), "Has two duplicates should work in a hash map");
        assertFalse(duplicatesChecker.hasDuplicatesSorted(array), "Has two duplicates should work in a sorted array");
    }
}
