package CJPractice.Basics;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int decimal_num = 0;
        int digit_idx = 0;

        while(num > 0){
            int k = num % 10;
            decimal_num = decimal_num + (int)Math.pow(2, digit_idx)*k;
            num = num / 10;
            digit_idx++;
        }
        System.out.println(decimal_num);
    }
}
