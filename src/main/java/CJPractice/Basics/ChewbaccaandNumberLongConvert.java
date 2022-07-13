package CJPractice.Basics;

import java.util.Scanner;

/*
Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them.
Inverting digit t means replacing it with digit 9 - t.
Help Chewbacca to transform the initial number x
to the minimum possible positive number by inverting some (possibly, zero) digits.
The decimal representation of the final number shouldn't start with a zero.

Input Format
The first line contains a single integer x (1≤x≤10^18) — the number that Luke Skywalker gave to Chewbacca.
Constraints
x <= 100000000000000000
Output Format
Print the minimum possible positive number that Chewbacca can obtain after inverting some digits.
The number shouldn't contain leading zeroes.
Sample Input
4545
Sample Output
4444
Explanation
There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or greater than the original digit. If it is less, then invert it otherwise leave it.
 */
public class ChewbaccaandNumberLongConvert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_num = s.next();
        long inp_num_orig = Long.parseLong(inp_num);
        //Long to Int array

        int j = inp_num.length() - 1;
        int[] inp_num_arr = new int[inp_num.length()];
        long k = inp_num_orig;
        while (j >= 0) {
            inp_num_arr[j] = (int) k % 10;
            k = k / 10;
            j--;
        }
        //Logic for the greatest number after subtracting from 9
        int a = 0;

        while (a < inp_num_arr.length) {
            int diff = 9 - inp_num_arr[a];
            if (a == 0 && diff == 0) {
                //No OP
            } else {
                if (diff < inp_num_arr[a]) {
                    inp_num_arr[a] = diff;
                }

            }
            a++;
        }

//        System.out.println("Original number " + inp_num_orig);
        for (int i = 0; i < inp_num_arr.length; i++) {
            System.out.print(inp_num_arr[i]);
        }

    }
}
