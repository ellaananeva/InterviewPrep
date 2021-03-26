package dynamic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DynamicProgrammingSolver {


    public int climb(int n) {
        if (n == 1) return 1;
        int[] array = new int[n + 1];

        array[0] = 1;
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i <= n; i++) {

            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }

    public int getMaxProfit(int[] array) {
        int minPrice = array[0];
        int maxProfit = 0;
        for (int j : array) {
            int earn = j - minPrice;
            maxProfit = Math.max(maxProfit, earn);
            if (j < minPrice) minPrice = j;
        }
        return maxProfit;
    }

    public int getMaxSubarray(int[] array) {
        int currentSum = array[0];
        int maxSum = array[0];
        for (int i = 1; i< array.length; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
