package strings;

import java.util.HashMap;
import java.util.Locale;
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

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().trim().replaceAll("[^A-Za-z0-9]+", "");
        final int length = s.length();
        for (int i = 0, j = length-1; i < length && j >= 0; i++, j--) {
            if (s.charAt(i)!= s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        final int hLentgh = haystack.length();
        final int nLength = needle.length();
        if (hLentgh < nLength) return -1;
        int iH = 0, iN = 0;
        int result = -1;
        while (iH < hLentgh && iN < nLength)
        {
            char hCh = haystack.charAt(iH), nCh = needle.charAt(iN);
            if (hCh == needle.charAt(0) && result == -1) {
                result = iH;
            }
            if (hCh!= nCh) {
                iH++;
                if (result != -1) {
                    iN = 0;
                    iH = result+1;
                    result = -1;
                }
            } else {
                iH++;
                iN++;
            }
        }
        return iN == nLength ? result : -1;

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
