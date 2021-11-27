package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testIsPalindrome() {
            Palindrome palindrome = new Palindrome();

            assertTrue(palindrome.isPalindrome("anna"));
            assertFalse(palindrome.isPalindrome("xyz"));
            assertTrue(palindrome.isPalindrome("x"));
            assertTrue(palindrome.isPalindrome(""));
    }
}