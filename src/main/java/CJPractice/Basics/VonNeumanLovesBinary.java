package CJPractice.Basics;/*
Given a binary number ,help Von Neuman to find out its decimal representation.
For eg 000111 in binary is 7 in decimal.


Input Format
The first line contains N , the number of binary numbers.
Next N lines contain N integers each representing binary represenation of number.


Constraints
N<=1000 Digits in binary representation is <=16.


Output Format
N lines,each containing a decimal equivalent of the binary number.


Sample Input
4
101
1111
00110
111111
Sample Output
5
15
6
63
Explanation
For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.
 */

import java.util.Scanner;

public class VonNeumanLovesBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num_of_test_cases = s.nextInt();

        while(num_of_test_cases > 0){
            String binary_string = s.next();
            char[] binary_arr = binary_string.toCharArray();
            long max_idx = binary_string.length() - 1;
            long decimal_num = 0;
            for (char c : binary_arr) {
                decimal_num = decimal_num + (powerOf(2, max_idx) * Integer.parseInt(Character.toString(c)));
//                System.out.println("Intermediary result >> " + decimal_num);
                max_idx = max_idx - 1;
            }
            num_of_test_cases = num_of_test_cases - 1;
            System.out.println(decimal_num);
        }

    }

    public static long powerOf(long base , long exponent){
        long res = 1;
        if(exponent == 0){
            res = 1;
        }
        else{
            while(exponent > 0){
                res = res * base;
                exponent = exponent - 1;
            }

        }
        return res;
    }
}
