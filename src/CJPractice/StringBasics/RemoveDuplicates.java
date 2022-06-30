/*
Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.
Sample Input aabccba
Sample Output abcba
 */
package CJPractice.StringBasics;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_str = s.next();
    }
    public static void removeDupsAndPrint(String inp_str){
        String ans = "";
        for (int i = 0; i < inp_str.length(); i++) {
            char last_char_added = inp_str.charAt(i);
            if (inp_str.charAt(i) == inp_str.charAt(i+1)){
                last_char_added = inp_str.charAt(i);

            }
            else{
                last_char_added = inp_str.charAt(i+1);
            }
        }

    }
}
