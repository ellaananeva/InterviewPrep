package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import strings.StringAnalyzer;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    @DisplayName("Empty string")
    public void testEmptyString() {
        String str = "";
        assertEquals(-1, stringAnalyzer.getFirstUniqueChar(str),
                "No unique char works");
    }
}
