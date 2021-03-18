package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import strings.StringAnalyzer;

import static org.junit.jupiter.api.Assertions.*;

public class StringAnalyzerTest {
    private StringAnalyzer stringAnalyzer;

    @BeforeEach
    public void setUp() throws Exception {
        stringAnalyzer = new StringAnalyzer();
    }

    @Test
    @DisplayName("Get first unique character default")
    public void testGetFirstUniqueCharDefault() {
        String str = "loveleetcode";
        assertEquals(2, stringAnalyzer.getFirstUniqueChar(str),
                "Default first unique char works");
    }

    @Test
    @DisplayName("Get first unique character first")
    public void testGetFirstUniqueCharFirst() {
        String str = "love";
        assertEquals(0, stringAnalyzer.getFirstUniqueChar(str),
                "First first unique char works");
    }

    @Test
    @DisplayName("No  unique character first")
    public void testNoUniqueCharFirst() {
        String str = "lloovvee";
        assertEquals(-1, stringAnalyzer.getFirstUniqueChar(str),
                "No unique char works");
    }

    @Test
    @DisplayName("Empty string unique character")
    public void testEmptyStringUniqueCharacter() {
        String str = "";
        assertEquals(-1, stringAnalyzer.getFirstUniqueChar(str),
                "No unique char works");
    }

    @Test
    @DisplayName("Anagram default")
    public void testIsAnagramDefault() {
        String s = "nagaram";
        String t = "anagram";
        assertTrue(stringAnalyzer.isAnagram(s, t),
                "Default anagram works");
    }

    @Test
    @DisplayName("Not anagram")
    public void testIsNotAnagramDefault() {
        String s = "dfghj";
        String t = "fdjgah";
        assertFalse(stringAnalyzer.isAnagram(s, t),
                "Not anagram works");
    }

    @Test
    @DisplayName("Empty anagram")
    public void testIsEmptyAnagramDefault() {
        String s = "";
        String t = "";
        assertTrue(stringAnalyzer.isAnagram(s, t),
                "Not anagram works");
    }

    @Test
    @DisplayName("Unicode anagram")
    public void testIsUnicodeAnagramDefault() {
        String s = "\u2202b";
        String t = "b\u2202";
        assertTrue(stringAnalyzer.isAnagram(s, t),
                "Unicode anagram works");
    }

    @Test
    @DisplayName("Palindrome default")
    public void testIsPalindromDefault() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(stringAnalyzer.isPalindrome(s),
                "Default palindrome works");
    }

    @Test
    @DisplayName("Palindrome short")
    public void testShortNotPalindrome() {
        String s = "0P";
        assertFalse(stringAnalyzer.isPalindrome(s),
                "Short palindrome works");
    }

    @Test
    @DisplayName("Not palindrome")
    public void testNotPalindromeDefault() {
        String s = "A man, a plan, a canal:";
        assertFalse(stringAnalyzer.isPalindrome(s),
                "Not palindrome works");
    }
}
