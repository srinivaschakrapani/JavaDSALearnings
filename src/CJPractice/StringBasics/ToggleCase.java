
/*
ake as input S, a string.
Write a function that toggles the case of all characters in the string.
Print the value returned.
 */
package CJPractice.StringBasics;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        toggleCase("abC");
//        char ch = 21;
//        int ct = 'a';
        Scanner s = new Scanner(System.in);
        toggleCase(s.next());

    }

    public static void toggleCase(String inp_string) {
        String ans = "";
        char[] inp_arr = inp_string.toCharArray();
        for (int i = 0; i < inp_arr.length; i++) {
            if (inp_arr[i] >= 'a' && inp_arr[i] <= 'z') {
                char ch = (char) (inp_arr[i] - ('a' - 'A'));
                ans = ans + ch + "";
            }
            if (inp_arr[i] >= 'A' && inp_arr[i] <= 'Z') {
                char ch = (char) (inp_arr[i] + ('a' - 'A'));
                ans = ans + ch + "";
            }

        }
        //usning Enhanced for loop
//        for (char x : inp_arr) {
//            if (x >= 'a' && x <= 'z') {
//                char ch = (char) (x - ('a' - 'A'));
//                ans = ans + ch + "";
//            }
//            if (x >= 'A' && x <= 'Z') {
//                char ch = (char) (x + ('a' - 'A'));
//                ans = ans + ch + "";
//            }
//        }
        System.out.println(ans);
    }
}
