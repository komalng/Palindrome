package palindrome;
public class PalindromeChecker{
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String maybePalindrome) {
        if (maybePalindrome.equals("") || maybePalindrome.length() == 1) {
            return true;
        }
        int lenghtOfMaybePalindrome = maybePalindrome.length() - 1;
        boolean maybeSamesubstring = isMaybeSamesubstring(maybePalindrome, lenghtOfMaybePalindrome);
        return maybeSamesubstring && isPalindrome(maybePalindrome.substring(1,lenghtOfMaybePalindrome));


}
    public static boolean isMaybeSamesubstring(String maybePalindrome, int lenghtOfMaybePalindrome) {
        return maybePalindrome.substring(0, 1).equals(maybePalindrome.substring(lenghtOfMaybePalindrome));
    }

}