// 647. Palindromic Substrings
package LeetCode.Medium;

public class PalindromicSubstringQuadraticTime {
    public static void main(String[] args) {
//        String inp_string = "nitin";
        String inp_string = "aaaa";
        printAllPalindromicSubStringsLinearTime(inp_string);
    }

    public static void printAllPalindromicSubStringsLinearTime(String inp_string) {
        int count_substr = 0;
        // Print palindromnes of Odd length
        for (int axis = 0; axis < inp_string.length(); axis++) {
            for (int radius = 0; axis - radius >= 0 && axis + radius < inp_string.length(); radius++) {
                int L_idx = axis - radius;
                int R_idx = axis + radius;

                if (inp_string.charAt(L_idx) == inp_string.charAt(R_idx)) {
                    System.out.println(inp_string.substring(L_idx, R_idx + 1));
                } else {
                    break;
                }

            }
        }

        // Print Palindromes for even length
        for (double axis = 0.5; axis < inp_string.length(); axis++) {
            for (double radius = 0.5; axis - radius >= 0 && axis + radius < inp_string.length(); radius ++) {
                int L_idx = (int) (axis - radius);
                int R_idx = (int) (axis + radius);
                if (inp_string.charAt(L_idx) == inp_string.charAt(R_idx)) {
                    System.out.println(inp_string.substring(L_idx, R_idx + 1));
                } else {
                    break;
                }

            }

        }
    }

}
