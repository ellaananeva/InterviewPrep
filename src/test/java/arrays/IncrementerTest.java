package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncrementerTest {
    private Incrementer incrementer;

    @BeforeEach
    public void setUp() throws Exception {
        incrementer = new Incrementer();
    }

    @Test
    @DisplayName("Increment 9")
    public void testIncrement9() {
        int[] array = new int[] {2, 1, 9};
        int[] result = new int[] {2, 2, 0};
        Assertions.assertArrayEquals(result, incrementer.incrementString(array),
                "Increment 1 works, string");
        Assertions.assertArrayEquals (result, incrementer.incrementArray(array),
                "Increment 1 works, array");
    }

    @Test
    @DisplayName("Increment 0")
    public void testIncrement0() {
        int[] array = new int[] {0};
        int[] result = new int[] {1};
        Assertions.assertArrayEquals(result, incrementer.incrementString(array),
                "Increment 0 works, string");
        Assertions.assertArrayEquals (result, incrementer.incrementArray(array),
                "Increment 0 works, array");
    }

    @Test
    @DisplayName("Increment default")
    public void testIncrementDefault() {
        int[] array = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 1};
        Assertions.assertArrayEquals (result, incrementer.incrementString(array),
                "Increment default works, string");
        Assertions.assertArrayEquals (result, incrementer.incrementArray(array),
                "Increment default works, array");
    }

    @Test
    @DisplayName("Increment default")
    public void testIncrementNines() {
        int[] array = new int[] {9, 9, 9, 9, 9, 9};
        int[] result = new int[] {1, 0, 0, 0, 0, 0, 0};
        Assertions.assertArrayEquals (result, incrementer.incrementArray(array),
                "Increment default works, array");
    }
}
