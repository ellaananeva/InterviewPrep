package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringReversalTest {
    private StringConverter stringConverter;

    @BeforeEach
    public void setUp() throws Exception {
        stringConverter = new StringConverter();
    }

    @Test
    @DisplayName("Test default string")
    public void testDefaultString() {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        char[] result = {'o', 'l', 'l', 'e', 'h'};
        Assertions.assertArrayEquals(result, stringConverter.reverseString(str),
                "Default reversal works");

    }

    @Test
    @DisplayName("Test single char string")
    public void testSingleChar() {
        char[] str = {'h'};
        char[] result = {'h'};
        Assertions.assertArrayEquals(result, stringConverter.reverseString(str),
                "Single char reversal works");

    }

    @Test
    @DisplayName("Test two chars string")
    public void testTwoChar() {
        char[] str = {'h', 'e'};
        char[] result = {'e', 'h'};
        Assertions.assertArrayEquals(result, stringConverter.reverseString(str),
                "Two chars reversal works");

    }
}
