package CJPractice.StringBasics;

import java.util.Scanner;

/*
Take as input S, a string. Write a function that does basic string compression.
Print the value returned. E.g. for input “aaabbccds” print out a3b2c2d1s1.
 */
public class StringCompression {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String inp_string = s.next();
        compressString("aaaxybbczw");

    }

    public static void compressString(String inp_str) {
        String ans = "";
        for (int i = 0; i < inp_str.length(); ) {
            int count = 1;
            while (i < inp_str.length() - 1 && inp_str.charAt(i) == inp_str.charAt(i + 1)) {
                count++;
                i++;
            }
            int last_index_of_i = inp_str.lastIndexOf(inp_str.charAt(i));
            //In case of only 1 character , do not add the number
            ans = inp_str.substring(last_index_of_i, last_index_of_i + 1) + (count == 1? "":count);
            //Always add number at end
//            ans = inp_str.substring(last_index_of_i, last_index_of_i + 1) + count;
            System.out.print(ans);
            i++;
        }

    }
}
