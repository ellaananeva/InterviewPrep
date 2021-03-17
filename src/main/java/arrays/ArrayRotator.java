package arrays;

public class ArrayRotator {

    public int[] rotateInPlace(int[] input, int k) {
      k %= input.length;
      int count = 0;
      for (int i=0; count<input.length; i++) {
          int current = i;
          int previousValue = input[current];
          do {
              int next = (current + k) % input.length;
              int temp = input[next];
              input[next] = previousValue;
              previousValue = temp;
              current = next;
              count++;

          } while (current != i);
      }
        return input;
    }


    public int[] rotateWithMemory(int[] input, int k) {
        if (k == 0) return input;
        if (input.length == 0) return input;
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[(i + k) % input.length] = input[i];
        }
        return output;
    }

    public int[] rotateAsString(int[] input, int k) {
        if (k == 0) return input;
        k = k % input.length;
        String arrayString;
        StringBuilder sb = new StringBuilder();
        for (int j : input) {
            sb.append((char) j);
        }
        arrayString = sb.toString();
        sb.setLength(0);
        String result = sb.append(arrayString.substring(input.length - k)).append((arrayString), 0, input.length - k).toString();
        System.out.println(result);
        return result.chars().toArray();
    }
}
