/*
Take as input S, a string.
Write a function that replaces every even character
with the character having just higher ASCII code
and every odd character with the character having just lower ASCII code. Print the value returned.

Sample Input : abcg
Sample Output : badf

 */
package CJPractice.StringBasics;

import java.util.Scanner;

public class OddEvenCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        oddEven(s.next());

    }

    public static void oddEven(String inp_string) {
        String ans = "";
        for (int i = 0; i < inp_string.length(); i++) {
            if (i % 2 == 0) {
                String s = (char) (inp_string.charAt(i) + 1) + "";
                ans = ans + s;
            } else {
                String s = (char) (inp_string.charAt(i) - 1) + "";
                ans = ans + s;

            }
        }
        System.out.println(ans);

    }
}
