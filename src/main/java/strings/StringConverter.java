package strings;

public class StringConverter {
    public static char[] reverseString(char[] str) {
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

    public int myAtoi(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        if (i < str.length()) {
            StringBuilder sb = null;
            char ch = str.charAt(i);
            boolean isSigned = ch == '+' || ch == '-';
            if (i + 1 < str.length() && isSigned && Character.isDigit(str.charAt(i + 1))) {
                sb = new StringBuilder();
                sb.append(ch);
                i++;
            }
            if (Character.isDigit(str.charAt(i))) {
                if (sb == null) sb = new StringBuilder();
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    sb.append(str.charAt(i));
                    i++;
                }
                String intStr = sb.toString();
                try {
                    return Integer.parseInt(intStr);
                } catch (NumberFormatException ex) {
                    return intStr.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }
        }
        return 0;

    }


}
