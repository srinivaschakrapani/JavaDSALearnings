/*
Take as input S, a string. Write a program that inserts between each pair of
characters the difference between their ascii codes and print the ans.

Sample Input
acb
Sample Output
a2c-1b
 */
package CJPractice.StringBasics;

import java.util.Scanner;

public class DifferenceInAsciiCodes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_str = s.next();
        differnceASCII(inp_str);

    }

    public static void differnceASCII(String inp_str) {
        String ans = "";
        int str_last_idx = inp_str.length() - 1;

        for (int i = 0; i < str_last_idx; i++) {
            int diff = inp_str.charAt(i+1) - inp_str.charAt(i);
            ans = ans + inp_str.charAt(i) + "" + diff;
        }
        //Add the last character
        ans = ans + inp_str.charAt(str_last_idx);
        System.out.println(ans);
    }
}
