package palindrome;

import org.junit.jupiter.api.Test;
import palindrome.PalindromeChecker;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void testIsPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("madam"));
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    // TODO: Add at least three more tests
}
