
public class Palindrome {

    public static boolean isPalindrome(String s) {
        return s.toLowerCase().equals(new StringBuilder(s).reverse().toString());
    }
}
