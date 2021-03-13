package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ZeroesProcessorTest {
    private ZeroesProcessor zeroesProcessor;

    @BeforeEach
    public void setUp() throws Exception {
        zeroesProcessor = new ZeroesProcessor();
    }

    @Test
    @DisplayName("Test move zeroes default")
    public void testMoveZeroesDefault() {
        int[] array = new int[] {5, 1, 3, 0, 6, 0, 4, 8, 0};
        int[] output = new int [] {5, 1, 3, 6, 4, 8, 0, 0, 0};
        Assertions.assertArrayEquals(output, zeroesProcessor.moveZeroes(array),
                "Default move zeroes should work");
    }

    @Test
    @DisplayName("Test start with 0")
    public void testStartWithZero() {
        int[] array = new int[] {0, 0, 5, 1, 3, 0};
        int[] output = new int [] {5, 1, 3, 0, 0, 0};
        Assertions.assertArrayEquals(output, zeroesProcessor.moveZeroes(array),
                "Default move zeroes should work");
    }

    @Test
    @DisplayName("Test no zero")
    public void testNoZero() {
        int[] array = new int[] { 5, 1, 3, 6};
        int[] output = new int [] {5, 1, 3, 6};
        Assertions.assertArrayEquals(output, zeroesProcessor.moveZeroes(array),
                "Default move zeroes should work");
    }
}
