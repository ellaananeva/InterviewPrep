package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ArrayRotatorTest {
    private ArrayRotator arrayRotator;

    @BeforeEach
    public void setUp() throws Exception {
        arrayRotator = new ArrayRotator();
    }

    @Test
    @DisplayName("Test Rotate 3")
    public void testRotate3() {
        int[] input = new int[] {5, 1, 3, 6, 4, 8};
        int[] output = new int[] {6, 4, 8, 5,1,3};
        int k = 3;
        Assertions.assertArrayEquals(output, arrayRotator.rotateWithMemory(input, k), "With memory works");

        Assertions.assertArrayEquals(output, arrayRotator.rotateAsString(input, k),
                "As strings works");
        Assertions.assertArrayEquals(output, arrayRotator.rotateInPlace(input, k),
                "In place works");
    }

    @Test
    @DisplayName("Test Rotate 2")
    public void testRotate2() {
        int[] input = new int[] {5, 1, 3, 6, 4, 8};
        int[] output = new int[] {4, 8, 5, 1, 3, 6};
        int k = 2;

        Assertions.assertArrayEquals(output, arrayRotator.rotateWithMemory(input, k), "With memory works");

        Assertions.assertArrayEquals(output, arrayRotator.rotateAsString(input, k),
                "As strings works");
        Assertions.assertArrayEquals(output, arrayRotator.rotateInPlace(input, k),
                "In place works");
    }

    @Test
    @DisplayName("Test Rotate 1")
    public void testRotate1() {
        int[] input = new int[] {5, 1, 3, 6, 4, 8};
        int[] output = new int[] {8, 5, 1, 3, 6, 4};
        int k = 1;

        Assertions.assertArrayEquals(output, arrayRotator.rotateWithMemory(input, k), "With memory works");

          Assertions.assertArrayEquals(output, arrayRotator.rotateAsString(input, k),
                "As strings works");Assertions.assertArrayEquals(output, arrayRotator.rotateInPlace(input, k),
                "In place works");
    }

    @Test
    @DisplayName("Test Rotate Short")
    public void testRotateShort() {
        int[] input = new int[] {1,2};
        int[] output = new int[] {2,1};
        int k = 3;
        Assertions.assertArrayEquals(output, arrayRotator.rotateWithMemory(input, k), "With memory works");

        Assertions.assertArrayEquals(output, arrayRotator.rotateAsString(input, k),
                "As strings works");
        Assertions.assertArrayEquals(output, arrayRotator.rotateInPlace(input, k),
                "In place works");
    }


    @Test
    @DisplayName("Test Rotate Zero")
    public void testZeroK() {
        int[] input = new int[] {5, 1, 3, 6, 4, 8};
        int[] output = input;
        int k = 0;

        Assertions.assertArrayEquals(output, arrayRotator.rotateWithMemory(input, k),
                "With memory works");
        Assertions.assertArrayEquals(output, arrayRotator.rotateAsString(input, k),
                "As strings works");
        Assertions.assertArrayEquals(output, arrayRotator.rotateInPlace(input, k),
                "In place works");
    }
}
