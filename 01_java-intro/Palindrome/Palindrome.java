
public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String lowred = s.toLowerCase();
        return lowred.equals(new StringBuilder(lowred).reverse().toString());
    }
}
