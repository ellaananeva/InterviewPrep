package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntersectionTest {
    private IntersectionFinder intersectionFinder;

    @BeforeEach
    public void setUp() throws Exception {
        intersectionFinder = new IntersectionFinder();
    }

    @Test
    @DisplayName("Test subarray")
    public void testSubArray() {
        int[] array1 = new int[]{1, 2, 2, 1};
        int[] array2 = new int[]{2, 2};
        int[] result = new int[] {2, 2};
        Assertions.assertArrayEquals(result, intersectionFinder.getIntersection(array1, array2),
                "Subarray works sorted");
        Assertions.assertArrayEquals(result, intersectionFinder.getIntersectionMap(array1, array2),
                "Subarray works map");
    }

    @Test
    @DisplayName("Test With Intersection")
    public void testIntersectionDefault() {
        int[] array1 = new int[]{4,9,5};
        int[] array2 = new int[]{9,4,9,8,4};
        int[] result = new int[] {4,9};
       Assertions.assertArrayEquals(result, intersectionFinder.getIntersection(array1, array2),
                "Default Intersection works sorted");
        Assertions.assertArrayEquals(result, intersectionFinder.getIntersectionMap(array1, array2),
                "Default Intersection works map");
    }

    @Test
    @DisplayName("Test No Intersection")
    public void testNoIntersection() {
        int[] array1 = new int[]{4,9,5};
        int[] array2 = new int[]{8,10};
        int[] result = new int[] {};
        Assertions.assertArrayEquals(result, intersectionFinder.getIntersection(array1, array2),
                "No Intersection works sorted");
        Assertions.assertArrayEquals(result, intersectionFinder.getIntersectionMap(array1, array2),
                "No Intersection works map");
    }
}
