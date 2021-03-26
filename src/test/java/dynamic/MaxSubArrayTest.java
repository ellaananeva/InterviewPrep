package dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSubArrayTest {
    private DynamicProgrammingSolver solver;

    @BeforeEach
    public void setUp() throws Exception {
        solver = new DynamicProgrammingSolver();
    }

    @Test
    @DisplayName("Test default subarray")
    public void testDefaultSubarray() {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, solver.getMaxSubarray(input));
    }
}
