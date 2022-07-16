package CJPractice.Recursion.CR;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        printAllPhoneNumbers("23", "");


    }

    public static void printAllPhoneNumbers(String pattern, String path) {
        if (pattern.isEmpty()) {
            System.out.println(path);
            return;
        }

        char ch = pattern.charAt(0);
        String prefix_str = option(ch);
        String remain_patt = pattern.substring(1);
        for (int i = 0; i < prefix_str.length(); i++) {
            printAllPhoneNumbers(remain_patt, path + prefix_str.charAt(i));
        }
    }

    public static String option(char ch) {
        if (ch == '2') {
            return "abc";
        }
        if (ch == '3') {
            return "def";
        }
        if (ch == '4') {
            return "ghi";
        }
        if (ch == '5') {
            return "jkl";
        }
        if (ch == '6') {
            return "mno";
        }
        if (ch == '7') {
            return "pqrs";
        }
        if (ch == '8') {
            return "tuv";
        }
        return "wxyz";

    }

}
