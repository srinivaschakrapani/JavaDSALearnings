/*
Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.
Sample Input aabccba
Sample Output abcba
 */
package CJPractice.StringBasics;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String inp_str = s.next();
        removeDupsAndPrint("aazbbdzzqaap");
    }
    public static void removeDupsAndPrint(String inp_str){
        String ans = "";
        for (int i = 0; i < inp_str.length();) {
            char char_to_be_added = inp_str.charAt(i);
            int j = i+1;
            for (; j < inp_str.length();) {

                if (inp_str.charAt(i) == inp_str.charAt(j)){
                    j++;
                }
                else {
                    break;
                }

            }
            ans = ans + char_to_be_added + "";
            i = j;
        }
        System.out.println(ans);

    }
}
