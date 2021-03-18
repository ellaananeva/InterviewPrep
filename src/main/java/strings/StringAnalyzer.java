package strings;

import java.util.HashMap;
import java.util.Map;

public class StringAnalyzer {

    public int getFirstUniqueChar(String s) {
        Map<Character, Integer> map = getCharacterFrequencyMap(s);

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = getCharacterFrequencyMap(s);
        Map<Character, Integer> mapT = getCharacterFrequencyMap(t);
        final int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (!mapS.get(ch).equals(mapT.get(ch))) {
                return false;
            }
        }
        return true;

    }

    private Map<Character, Integer> getCharacterFrequencyMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int freq = map.getOrDefault(ch, 0) + 1;
            map.put(ch, freq);
        }
        return map;
    }
}
