package strings;

import java.util.HashMap;

public class StringAnalyzer {

    public int getFirstUniqueChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        final int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            int freq = map.getOrDefault(ch, 0) + 1;
            map.put(ch, freq);
        }

        for (int i = 0; i < length; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
