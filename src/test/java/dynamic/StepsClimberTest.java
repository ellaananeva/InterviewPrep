package dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StepsClimberTest {

    private DynamicProgrammingSolver solver;

    @BeforeEach
    public void setUp() throws Exception {
        solver = new DynamicProgrammingSolver();
    }

    @Test
    @DisplayName("Test 3 steps")
    public void testClimb3() {

        Assertions.assertEquals(3, solver.climb(3), "climbed 3 steps");

    }

    @Test
    @DisplayName("Test 2 steps")
    public void testClimb2() {

        Assertions.assertEquals(2, solver.climb(2), "climbed 3 steps");

    }

    @Test
    @DisplayName("Test 4 steps")
    public void testClimb4() {

        Assertions.assertEquals(5, solver.climb(4), "climbed 3 steps");

    }

}
