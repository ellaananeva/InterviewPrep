package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionFinder {

    public int[] getIntersection(int[] array1, int[]array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        ArrayList<Integer> result = new ArrayList<>();
        int i1 =0, i2 =0;
        while (i1 < array1.length && i2 < array2.length) {
            if (array1[i1] == array2[i2]) {
                result.add(array1[i1]);
                i1++;
                i2++;
            } else if (array1[i1] < array2[i2]) {
                i1++;
            } else {
                i2++;
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public int[] getIntersectionMap(int[] array1, int[] array2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.stream(array1).forEach((el) -> {
            if (map.containsKey(el)) {
                map.put(el, map.get(el)+1);
            } else {
                map.put(el, 1);
            }
        });
        for (int el: array2) {
            if (map.containsKey(el) && map.get(el) > 0) {
                result.add(el);
                map.put(el, map.get(el)-1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
