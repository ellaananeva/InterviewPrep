package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAtoiTest {
    private StringConverter stringConverter;

    @BeforeEach
    public void setUp() throws Exception {
        stringConverter = new StringConverter();
    }

    @Test
    @DisplayName("Get positive int")
    public void testPositive() {
        String input = "   42";
        assertEquals(42, stringConverter.myAtoi(input),
                "Simple positive int generated");
    }

    @Test
    @DisplayName("Get negative int with leading spaces")
    public void testNegative() {
        String input = "   -42";
        assertEquals(-42, stringConverter.myAtoi(input),
                "Simple negative int generated");
    }

    @Test
    @DisplayName("Get negative int with spaces")
    public void testNegativeWithSpaces() {
        String input = "   - 42";
        assertEquals(0, stringConverter.myAtoi(input),
                "Negative int with spaces not generated");
    }

    @Test
    @DisplayName("Get positive with words")
    public void testPositiveWithWords() {
        String input = "42 and some words";
        assertEquals(42, stringConverter.myAtoi(input),
                "Positive int with words generated");
    }

    @Test
    @DisplayName("Get negative with words")
    public void testNegativeWithWords() {
        String input = "-42 and some words";
        assertEquals(-42, stringConverter.myAtoi(input),
                "Negative int with words generated");
    }

    @Test
    @DisplayName("Get large negative")
    public void testLargeNegative() {
        String input = "-91283472332";
        assertEquals(-2147483648, stringConverter.myAtoi(input),
                "Large negative int clamped");
    }

    @Test
    @DisplayName("Get positive int with +")
    public void testPositiveWithASign() {
        String input = "   +42";
        assertEquals(42, stringConverter.myAtoi(input),
                "Simple negative int generated");
    }
}
