package CJPractice.Basics;/*
A Boston number is a composite number, the sum of whose digits is the
sum of the digits of its prime factors obtained as a result of
prime factorization (excluding 1 ).
The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 .
For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number
since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7.
Write a program to check whether a given integer is a Boston number.

Input Format
There will be only one line of input:N , the number which needs to be checked.


Constraints
1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)


Output Format
1 if the number is a Boston number. 0 if the number is a not Boston number.
 */

import java.util.Scanner;

public class BostonNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum_of_digits = 0;
        int sum_prime_factors = 0;
        int k = num;
        // Find sum of the digits
        while(k > 0){
            int rem = k % 10;
            sum_of_digits = sum_of_digits + rem;
            k = k / 10;
        }
        //find sum of primefactors
        int i = 2;
        while(i <= num){
            if(num % i == 0){
                // a factor
                if(isPrime(i)){
                    while(num%i == 0){
                        k = i;
//                        System.out.println("CJPractice.Basics.Prime factor => " + i);
                        while(k > 0){
                            sum_prime_factors = sum_prime_factors + k%10;
                            k = k/10;

                    }
                        num = num / i;
                    }
                    //sum_prime_factors = sum_prime_factors + i;
                }

            }
            i = i + 1;
        }
        if(sum_of_digits == sum_prime_factors){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }

    public static boolean isPrime(int inp_num){
        boolean is_prime = true;

        if(inp_num == 1){
            is_prime = false;
        }
        else{
            int start_val = 2;
            while(start_val < inp_num){
                if(inp_num % start_val == 0){
                    is_prime = false;
                    break;
                }
                start_val = start_val + 1;
            }
        }
        return is_prime;
    }

}