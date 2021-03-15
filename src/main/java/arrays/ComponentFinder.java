package arrays;

import java.util.HashMap;

public class ComponentFinder {
    public int[] getComponentIndices(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(array.length);
        for (int i =0; i< array.length; i++) {
            if (map.containsKey(target-array[i])) {
                return new int[] {map.get(target-array[i]), i};
            }
            map.put(array[i], i);
        }
        return new int[]{};
    }
}
