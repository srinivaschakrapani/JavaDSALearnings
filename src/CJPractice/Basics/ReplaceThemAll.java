package CJPractice.Basics;

import java.util.Scanner;

//Given a integer as a input and replace all the '0' with '5' in the integer
public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long inp_num = s.nextLong();

        //Reverse the number by replacing Zero with 5
        long rev_num = 0;
        if (inp_num == 0) {
            rev_num = 5;
        } else {
            while (inp_num > 0) {
                long k = inp_num % 10;
                if (k == 0) {
                    rev_num = rev_num * 10 + 5;
                } else {
                    rev_num = rev_num * 10 + k;
                }
                inp_num = inp_num / 10;

            }
        }
        rev_num = reverseADigit(rev_num);
        System.out.println(rev_num);
    }

    public static long reverseADigit(long inp_num) {
        long rev_num = 0;
        while (inp_num > 0) {
            long k = inp_num % 10;
            rev_num = rev_num * 10 + k;
            inp_num = inp_num / 10;

        }
        return rev_num;
    }
}
