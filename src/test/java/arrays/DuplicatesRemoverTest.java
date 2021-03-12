package arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class DuplicatesRemoverTest {
    private DuplicatesManager duplicatesManager;

    @BeforeEach
    public void setUp() throws Exception {
        duplicatesManager = new DuplicatesManager();
    }

    @Test
    @DisplayName("Remove duplicates default")
    public void testRemoveDuplicates() {
        Integer[] array = new Integer[] {0, 2, 3,2, 1, 0, 1};
        Arrays.sort(array);
        assertEquals(4, duplicatesManager.removeDuplicates(array),
                "Default duplicates removal");
    }

    @Test
    @DisplayName("Remove duplicates empty")
    public void testRemoveDuplicatesWithEmpty() {
        Integer[] array = new Integer[] {};
        assertEquals(0, duplicatesManager.removeDuplicates(array),
                "Remove duplicates in an empty array");
    }

    @Test
    @DisplayName("Remove duplicates in no duplicates")
    public void testRemoveDuplicatesWithNoDuplicates() {
        Integer[] array = new Integer[] {0, 1, 2, 3, 4};
        Arrays.sort(array);
        assertEquals(5, duplicatesManager.removeDuplicates(array),
                "Remove duplicates where there's none");
    }
}
