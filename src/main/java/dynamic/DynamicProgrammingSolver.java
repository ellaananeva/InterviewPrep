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
}
