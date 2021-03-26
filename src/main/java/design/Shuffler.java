package design;

import java.util.*;

public class Shuffler {
    private int[] array;
    private final int[] originalArray;
    private static final Random RANDOM = new Random();

    public Shuffler(int[] array) {
        this.array = array;
        originalArray = array.clone();
    }



    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swap(i, randRange(i, array.length));
        }
        return array;
    }


    private void swap(int i, int j) {
        int buf = array[i];
        array[i] = array[j];
        array[j] = buf;
    }

    private int randRange(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }

    public int[] reset() {
        array = originalArray.clone();
        return array;
    }
}
