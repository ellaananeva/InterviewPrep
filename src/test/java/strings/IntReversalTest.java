package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntReversalTest {
    private StringReversal stringReversal;

    @BeforeEach
    public void setUp() throws Exception {
        stringReversal = new StringReversal();
    }

    @Test
    @DisplayName("Get Reversed Number With Zero")
    public void testReverseIntWithZero() {
        int input = 120;
        assertEquals(21, stringReversal.reverseInt(input),
                "Number ending with zero reversed");
    }

    @Test
    @DisplayName("Get Reversed Number Default")
    public void testReverseIntDefault() {
        int input = 123;
        assertEquals(321, stringReversal.reverseInt(input),
                "Number ending with zero reversed");
    }

    @Test
    @DisplayName("Get Reversed Number Negative")
    public void testReverseNegativeInt() {
        int input = -123;
        assertEquals(-321, stringReversal.reverseInt(input),
                "Negative number reversed");
    }

}
