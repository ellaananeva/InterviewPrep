package arrays;

public class BinarySearch {

    public int getFirstTarget(int[] array, int target) {

        int low = 0;
        int high = array.length-1;
        while (low < high) {
            int mid = low + (high-low)/2;
            if (array[mid] == target) {
               high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        if (array[low] == target)
        {
            return low;
        }
        return -1;
    }

}
