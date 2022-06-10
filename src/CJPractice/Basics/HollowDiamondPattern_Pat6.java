package CJPractice.Basics;

import java.util.Scanner;

public class HollowDiamondPattern_Pat6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int N = 5;
        int N = s.nextInt();
        int row = 1;
        int nst = N;
        int nsp = N - 1;
        while (row <= N) {

            int csp = 0;
            while (csp < nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst = 0;
            while (cst < nst) {
                if (row == 1 || row == N || cst == 0 || cst == nst - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
                cst++;
            }

            row++;
            nsp--;
            System.out.println();
        }
    }
}
