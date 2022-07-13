package CJPractice.Basics;//Take the following as input.
//        A number
//        Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number.
//
//        Write a function that returns its inverse, where inverse is defined as follows
//
//        Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
//
//        Print the value returned.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int digitCount = countDigits(n);
        int[] digitArr = intToArray(n, digitCount);
        int[] resultArr = new int[digitCount];
        int idx = 1;
        for (int i = 0; i < digitArr.length; i++) {
            resultArr[digitArr[i] - 1] = idx;
            idx++;
        }
        for (int i = resultArr.length - 1; i >= 0; i--) {
            System.out.print(resultArr[i]);
        }

    }

    public static int countDigits(long n) {
        int count = 0;
        if (n < 10) {
            count = 1;
        } else {
            while (n > 0) {
                count++;
                n = n / 10;
            }
        }
        return count;
    }

    public static int[] intToArray(long n, int digitcount) {
        int[] intArr = new int[digitcount];
        int idx = 0;
        if (n < 10) {
            intArr[idx] = (int) n;
        } else {
            while (n > 0) {
                intArr[idx] = (int) (n % 10);
                idx++;
                n = n / 10;
            }
        }
//        Arrays.stream(intArr).forEach(x -> System.out.println(x));
//        System.out.println(intArr);
        return intArr;
    }
}
