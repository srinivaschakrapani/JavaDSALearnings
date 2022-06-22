package CJPractice.StringBasics;

public class Palindrome {
    public static void main(String[] args) {
        String inp_string = "nitin";
    }

    public static boolean isPalindrome(String inp_string) {
        int start = 0;
        int end = inp_string.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (inp_string.charAt(start) == inp_string.charAt(end)) {
                start++;
                end--;
            } else {
                isPalindrome = false;
                break;

            }
        }
        return isPalindrome;
    }

}