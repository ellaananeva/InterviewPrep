package arrays;

import jdk.jshell.spi.ExecutionControl;

import java.util.Arrays;
import java.util.Objects;

public class DuplicatesRemover {

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
}