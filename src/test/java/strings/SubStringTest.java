package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubStringTest {
    private StringAnalyzer stringAnalyzer;

    @BeforeEach
    public void setUp() throws Exception {
        stringAnalyzer = new StringAnalyzer();
    }

    @Test
    @DisplayName("Test strStr default")
    public void testDefaultStrStr() {
        String haystack = "hello";
        String needle = "ll";
        assertEquals(2, stringAnalyzer.strStr(haystack, needle),
                "Default strStr works");
    }

    @Test
    @DisplayName("Test no strStr")
    public void testNoStrStr() {
        String haystack = "hello";
        String needle = "aa";
        assertEquals(-1, stringAnalyzer.strStr(haystack, needle),
                "No strStr works");
    }

    @Test
    @DisplayName("Test strStr both empty")
    public void testEmptyStrStr() {
        String haystack = "";
        String needle = "";
        assertEquals(0, stringAnalyzer.strStr(haystack, needle),
                "No strStr works");
    }

    @Test
    @DisplayName("Test long strStr")
    public void testLongStrStr() {
        String haystack = "mississippi";
        String needle = "issip";
        assertEquals(4, stringAnalyzer.strStr(haystack, needle),
                "Long strStr works");
    }

    @Test
    @DisplayName("Test longest substring default")
    public void testLongestSubstringWithNoRepeatingCharactersDefault() {
        String input = "abcabcbb";
        assertEquals(3, stringAnalyzer.getLongestSubstringLength(input));
    }

    @Test
    @DisplayName("Test longest substring repeating")
    public void testLongestSubstringWithNoRepeatingCharactersRepeating() {
        String input = "bbbbbbb";
        assertEquals(1, stringAnalyzer.getLongestSubstringLength(input));
    }

    @Test
    @DisplayName("Test longest substring at the end")
    public void testLongestSubstringWithNoRepeatingCharactersEnding() {
        String input = "pwwkew";
        assertEquals(3, stringAnalyzer.getLongestSubstringLength(input));
    }

    @Test
    @DisplayName("Test longest substring 2")
    public void testLongestSubstringWithNoRepeatingCharacters2() {
        String input = "aw";
        assertEquals(2, stringAnalyzer.getLongestSubstringLength(input));
    }
}
