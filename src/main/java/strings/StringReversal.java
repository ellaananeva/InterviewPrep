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

    public int reverseInt(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        StringBuilder sb = new StringBuilder();
        if (x<0) sb.append("-");
        for (int i = chars.length-1; i>=(x<0?1:0); i--)
        {
            sb.append(chars[i]);
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }


}
