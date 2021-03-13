package arrays;


public class ZeroesProcessor {
    public int[] moveZeroes(int[] array) {
        int firstAvailable = -1;
        int i = 0;
        while (i < array.length) {
            if (array[i] == 0) {
                if (firstAvailable <0) {
                    firstAvailable = i;
                }
            } else {
                if (firstAvailable >= 0) {
                    array[firstAvailable] = array[i];
                    array[i] = 0;
                    firstAvailable = firstAvailable+1;
                }
            }
            i++;
        }
        return array;
    }
}
