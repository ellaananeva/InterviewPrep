package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Incrementer {

    public int[] incrementString(int[] array) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(array).forEach(sb :: append);
        long resultNum = Long.parseLong(sb.toString()) + 1;
        return Long.toString(resultNum).chars().flatMap(el -> IntStream.of(Character.getNumericValue(el))).toArray();
    }

    public int[] incrementArray(int[] array) {
        for (int i = array.length-1; i>=0; i--) {
            array[i]++;
            if (array[i] == 10) {
                array[i] = 0;
            } else {
                return array;
            }
        }
        return getNewArray(array);
    }

    private int[] getNewArray(int[] array) {
        int[] resultArray = new int[array.length+1];
        resultArray[0] = 1;
        for (int i = 1; i< resultArray.length; i++) {
            resultArray[i] = 0;
        }
        return resultArray;
    }
}
