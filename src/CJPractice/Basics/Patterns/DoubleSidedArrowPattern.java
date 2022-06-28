package CJPractice.Basics.Patterns;

import java.util.Scanner;

public class DoubleSidedArrowPattern {
    public static void main(String[] args) {
        int N = 7;
//        Scanner s = new Scanner(System.in);
//        int N = s.nextInt();
        int row = 1;
        int nsp1 = 2 * N - 2;
        int nsp2 = -1;
        int nst = 1;
        int num_start = 1;
        while (row <= N) {
            int csp1 = 0;
            while (csp1 < nsp1) {
                System.out.print(" ");
                csp1++;
            }
            int cst1 = 0;
            int ntp1 = num_start;
            while (cst1 < nst) {
//                System.out.print("* ");
                System.out.print(ntp1 + " ");
                ntp1--;
                cst1++;
            }

            int csp2 = 0;
            while (csp2 < nsp2) {
                System.out.print(" ");
                csp2++;
            }


            int cst2 = 0;
            if (row == 1 || row == N) {
                cst2 = 1;
            }
            int ntp2 = 1;

            while (cst2 < nst) {
//                System.out.print("* ");
                System.out.print(ntp2+" ");
                ntp2++;
                cst2++;
            }

            row++;

            if (row <= (N / 2 + 1)) {
                nst += 1;
                nsp1 -= 4;
                nsp2 += 4;
                num_start++;

            } else {
                nst -= 1;
                nsp1 += 4;
                nsp2 -= 4;
                num_start--;

            }
            System.out.println();

        }
    }
}
