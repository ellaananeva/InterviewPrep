package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComponentFinderTest {
    private ComponentFinder componentFinder;

    @BeforeEach
    public void setUp() throws Exception {
        componentFinder = new ComponentFinder();
    }

    @Test
    @DisplayName("Test default")
    public void testDefaultComponents() {
        int[] array = new int[]{2,7,11,15};
        int target = 9;
        int[] result = new int[] {0, 1};
        Assertions.assertArrayEquals(result, componentFinder.getComponentIndices(array, target),
                "It works");
    }

    @Test
    @DisplayName("Test default")
    public void testNoComponents() {
        int[] array = new int[]{2,7,11,15};
        int target = 1;
        int[] result = new int[] {};
        Assertions.assertArrayEquals(result, componentFinder.getComponentIndices(array, target),
                "No components are supposed to work");
    }

    @Test
    @DisplayName("Test default")
    public void testTwoComponents() {
        int[] array = new int[]{3,3};
        int target = 6;
        int[] result = new int[] {0,1};
        Assertions.assertArrayEquals(result, componentFinder.getComponentIndices(array, target),
                "Two equal components are supposed to work");
    }
}
