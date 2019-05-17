package palindrome;
public class PalindromeChecker{
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String maybePalindrome) {
        if (maybePalindrome.equals("") || maybePalindrome.length() == 1) {
            return true;
        }
        return false;
    }

}