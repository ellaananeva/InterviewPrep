package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockManagerTest {
    private StockManager stockManager;

    @BeforeEach
    public void setUp() throws Exception {
        stockManager = new StockManager();
    }

    @Test
    @DisplayName("Simple maximum profit")
    public void testGetMaximumProfit() {
        int[] array = new int[] {5, 1, 3, 6, 4, 8};
        assertEquals(9, stockManager.getMaximumProfit(array),
                "Simple maximum profit should work");
    }

    @Test
    @DisplayName("Simple maximum profit")
    public void testGetMaximumProfitUnlucky() {
        int[] array = new int[] {8, 7, 6, 5, 3};
        assertEquals(0, stockManager.getMaximumProfit(array),
                "No profit should work");
    }

    @Test
    @DisplayName("Simple maximum profit")
    public void testGetMaximumProfitEmpty() {
        int[] array = new int[] {};
        assertEquals(0, stockManager.getMaximumProfit(array),
                "Empty prices should work");
    }
}
