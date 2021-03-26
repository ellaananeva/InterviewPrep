package dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProfitTest {
    private DynamicProgrammingSolver solver;

    @BeforeEach
    public void setUp() throws Exception {
        solver = new DynamicProgrammingSolver();
    }

    @Test
    @DisplayName("Test default profit")
    public void testDefaultProfit() {

        int[] array = new int[] {7,1,5,3,6,4};
        assertEquals(5, solver.getMaxProfit(array),
                "Simple maximum profit should work");
    }


}
