/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package strings;

import org.junit.Test;
import palindrome.PalindromeChecker;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test public void emptyStringShouldBeAPalindrome() {
        assertTrue("Expected empty string to be a palindrome", PalindromeChecker.isPalindrome(""));
    }
    @Test public void aCharacterShouldBeAPalindrome(){
        assertTrue("A character string to be a palindrome", PalindromeChecker.isPalindrome("o"));
    }
    @Test public void stringShouldBeSameViceVersa(){
        assertTrue("String to be Palindrome",PalindromeChecker.isPalindrome("nitin"));
    }
}
