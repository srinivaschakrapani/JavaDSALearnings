package CJPractice.Recursion.Practice;

import java.util.Scanner;

/*
Given a positive integer, find maximum integer possible by doing
at-most K swap operations on its digits.

Constraints
0 <= N <= 10^12 0 <= K <= 10

Output Format
Single Maximum integer possible by doing at-most K swap operations on digits of N

Sample Input
254 1
Sample Output
524
 */
public class MaximumIntegerWithAtMostKSwaps {
    static long max = 0;
    static boolean found = false;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_str = s.next();
        int swap_cnt = s.nextInt();
//        String str = "254";
        maxKSwaps(inp_str.toCharArray(), swap_cnt);
        System.out.println(max);

    }

    public static void maxKSwaps(char[] arr, int swap_cnt) {
        long curr_num = Long.parseLong(new String(arr));
        if (curr_num > max) {
            max = curr_num;
            found = true;
            return;
        }

        if (swap_cnt == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                swap(arr, i, j);
//                System.out.println(arr);
                if (!found) {
                    maxKSwaps(arr, swap_cnt - 1);
                }
                swap(arr, i, j);
            }
        }


    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
