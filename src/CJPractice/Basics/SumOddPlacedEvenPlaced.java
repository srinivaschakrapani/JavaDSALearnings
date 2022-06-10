package CJPractice.Basics;

import java.util.Scanner;

public class SumOddPlacedEvenPlaced {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum_even = 0;
        int sum_odd = 0;

        int pos = 1;
        while(n > 0){
            int k = n % 10;
            if(pos % 2 == 0){
                sum_even = sum_even + k;
            }
            else{
                sum_odd = sum_odd + k;
            }
            n = n/10;
            pos = pos + 1;
        }

        System.out.println(sum_odd);
        System.out.println(sum_even);

    }
}
