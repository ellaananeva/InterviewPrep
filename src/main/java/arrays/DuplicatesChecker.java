package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicatesChecker {

    public boolean hasDuplicatesHashMap(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : array) {
            if (set.contains(j)) {
                return true;
            } else {
                set.add(j);
            }
        }
        return false;
    }

    public boolean hasDuplicatesSorted(int[] array) {
        sort(array);
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                return true;
            }
        }
        return false;
    }

    private void sort(int[] array) {
        Arrays.sort(array);
    }
}
