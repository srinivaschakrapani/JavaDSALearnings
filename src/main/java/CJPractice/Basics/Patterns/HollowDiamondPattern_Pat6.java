package CJPractice.Basics.Patterns;

import java.util.Scanner;

public class HollowDiamondPattern_Pat6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int N = 5;
        int N = s.nextInt();
        int row = 1;
        int nst1 = (N + 1) / 2;
        int nsp = -1;
        while (row <= N) {
            int cst1 = 0;
            while (cst1 < nst1) {
                System.out.print("*\t");
                cst1++;
            }
            int csp = 0;
            while (csp < nsp) {
                System.out.print("\t");
                csp++;

            }

            int cst2 = 0;
            if (row == 1 || row == N) {
                cst2 = 1;
            }

            while (cst2 < nst1) {
                System.out.print("*\t");
                cst2++;
            }
            row++;
            if (row <= ((N + 1) / 2)) {
                nst1 = nst1 - 1;
                nsp += 2;

            } else {
                nst1 = nst1 + 1;
                nsp -= 2;

            }

            System.out.println();
        }
    }
}
