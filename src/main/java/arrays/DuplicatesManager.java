package arrays;

import java.util.*;

public class DuplicatesManager {
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
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return true;
            }
        }
        return false;
    }

    private void sort(int[] array) {
        Arrays.sort(array);
    }

    public int removeDuplicates(Integer[] sortedArray) {
        int currentUnique = 0;
        int i = 0;
        if (sortedArray.length == 0) {
            return 0;
        } else {
            while (i < sortedArray.length) {
                if (!sortedArray[i].equals(sortedArray[currentUnique])) {
                    currentUnique++;
                    sortedArray[currentUnique] = sortedArray[i];
                }
                i++;
            }
            for (int j = currentUnique + 1; j < sortedArray.length; j++) {
                sortedArray[j] = null;
            }
            Arrays.stream(sortedArray).filter(Objects::nonNull).forEach(el -> System.out.print(el + " "));
            return currentUnique + 1;
        }
    }

    public int findSingleNumberWithHashMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(el -> {
            if (map.containsKey(el)) {
                map.put(el, map.get(el) + 1);
            } else map.put(el, 1);
        });
        OptionalInt result = Arrays.stream(nums).filter((el) -> map.get(el) == 1).findFirst();
        if (result.isPresent()) {
            return result.getAsInt();
        } else {
            throw new NullPointerException("No Single Number is Present");
        }
    }

    public int findSingleNumberSorted(int[] nums) {
        sort(nums);
        int count=1;
        int i=0;
        do {
            if (i == nums.length - 1) {
                if (count == 1) return nums[i];
                else break;
            }if (nums[i+1] == nums[i]) {
                count++;
            } else {
                if (count == 1) {
                    return nums[i];
                }
                count = 1;
            }
            i++;
        } while (i < nums.length);
        throw new NullPointerException("No Single Number is Present");
    }

    public int findSingleNumberInPlace(int[] nums) {
        throw new NullPointerException("No Single Number is Present");
    }
}
