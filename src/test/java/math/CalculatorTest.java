package math;

import dynamic.DynamicProgrammingSolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator solver;

    @BeforeEach
    public void setUp() throws Exception {
        solver = new Calculator();
    }

    @Test
    @DisplayName("Test power of 3")
    public void testPowerOfThree() {

        Assertions.assertTrue(solver.isPowerOfThree(3));
        Assertions.assertTrue(solver.isPowerOfThree(9));
        Assertions.assertFalse(solver.isPowerOfThree(8));
        Assertions.assertFalse(solver.isPowerOfThree(45));

    }

}
