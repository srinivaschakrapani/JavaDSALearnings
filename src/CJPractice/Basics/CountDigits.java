package CJPractice.Basics;//Take the following as input.
//        A number
//        A digit
//        Write a function that returns the number of times digit is found in the number. Print the value returned.
//
//        Input Format
//        Integer (A number) Integer (A digit)
// 1 000 000 000

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int d = s.nextInt();
        int count = 0;
        while(n > 9){
            long k = n%10;
            if(k == d){
                count++;
            }
            n = n/10;
        }
        if(n == d){
            count ++;
        }
        System.out.println(count);
    }
}
