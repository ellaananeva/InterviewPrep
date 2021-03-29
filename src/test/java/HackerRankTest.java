import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trees.BinaryTree;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HackerRankTest {
    @Test
    @DisplayName("Test beautiful days")
    public void testBeautiful() {

        assertEquals(2, HackerRank.beautifulDays(20, 23, 6));
        assertEquals(2998, HackerRank.beautifulDays(1, 2000000, 23047885));

    }

    @Test
    @DisplayName("Test ads")
    public void testAds() {

        assertEquals(5, HackerRank.viralAdvertising(2));
        assertEquals(24, HackerRank.viralAdvertising(5));

    }
}
