package CJPractice.Basics;//Take the following as input.
//
//        A number (N1)
//        A number (N2)
//        Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int seed = 1;
        while(n1 > 0){
            int val = 3*seed + 2;
            if(val % n2 != 0 ){
                System.out.println(val);
                n1 --;
            }
            seed ++;

        }


    }
}
