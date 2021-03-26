package design;

import dynamic.DynamicProgrammingSolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShufflerTest {



    @Test
    @DisplayName("Test default shuffler")
    public void testDefaultShuffle() {

        int[] array = {1, 2, 3, 4, 5};
        Shuffler shuffler = new Shuffler(array);
        shuffler.shuffle();
        Assertions.assertArrayEquals(new int []{1, 2, 3, 4, 5}, shuffler.reset());
    }

    @Test
    @DisplayName("Test shuffle 2")
    public void testShuffle2() {

        int[] array = {1, 2};
        Shuffler shuffler = new Shuffler(array);
        shuffler.shuffle();
        Assertions.assertArrayEquals(new int []{1, 2}, shuffler.reset());
    }
}
