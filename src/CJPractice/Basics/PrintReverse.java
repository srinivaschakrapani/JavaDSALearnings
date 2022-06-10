package CJPractice.Basics;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            System.out.print(r);
        }

    }
}
