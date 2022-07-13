package CJPractice.Basics;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int octal = 0;
        int idx = 0;
        while(N > 0){
            octal = octal + (N%8)*(int)Math.pow(10, idx);
            N = N /8;
            idx ++;
        }
        System.out.println(octal);
    }
}
