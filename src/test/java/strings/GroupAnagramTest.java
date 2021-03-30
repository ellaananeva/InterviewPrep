package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GroupAnagramTest {
    private StringAnalyzer stringAnalyzer;

    @BeforeEach
    public void setUp() throws Exception {
        stringAnalyzer = new StringAnalyzer();
    }

    @Test
    @DisplayName("Get first unique character default")
    public void testGetFirstUniqueCharDefault() {
        stringAnalyzer.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}
