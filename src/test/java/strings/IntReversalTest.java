package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntReversalTest {
    private StringConverter stringConverter;

    @BeforeEach
    public void setUp() throws Exception {
        stringConverter = new StringConverter();
    }

    @Test
    @DisplayName("Get Reversed Number With Zero")
    public void testReverseIntWithZero() {
        int input = 120;
        assertEquals(21, stringConverter.reverseInt(input),
                "Number ending with zero reversed");
    }

    @Test
    @DisplayName("Get Reversed Number Default")
    public void testReverseIntDefault() {
        int input = 123;
        assertEquals(321, stringConverter.reverseInt(input),
                "Number ending with zero reversed");
    }

    @Test
    @DisplayName("Get Reversed Number Negative")
    public void testReverseNegativeInt() {
        int input = -123;
        assertEquals(-321, stringConverter.reverseInt(input),
                "Negative number reversed");
    }

}
