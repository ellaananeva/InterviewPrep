package math;

import java.util.HashSet;
import java.util.Set;

public class Calculator {


    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i <n; i++) isPrime[i] = true;

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j <n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) count++;
            }
        return count;
    }

    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n%3 != 0) return false;
        while ( n%3 == 0) {
            n /= 3;
        }
        return n == 1;
    }


}
