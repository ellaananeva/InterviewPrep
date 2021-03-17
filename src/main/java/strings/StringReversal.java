package strings;

public class StringReversal {
    public char[] reverseString(char[] str) {
        int i = 0, j = str.length-1;
        while (i<=(str.length-1)/2 && j>(str.length-1)/2)
        {
            char buf = str[i];
            str[i] = str[j];
            str[j] = buf;
           i++;
           j--;
        }
        return str;
    }
}
