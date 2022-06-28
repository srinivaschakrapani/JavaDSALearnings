package CJPractice.Basics.Patterns;

import java.util.Scanner;

public class PatternInvertedHourGlass {
    public static void main(String[] args) {
        int N = 5;
//        Scanner s = new Scanner(System.in);
//        int N = s.nextInt();
        int no_rows = 2 * N + 1;
        int row = 1;

        int npr = N;
        int nst1 = 1;

        int nsp = 4 * N - 1;
        while (row <= no_rows) {
            int cst1 = 0;
            int ntp1 = npr;
            while (cst1 < nst1) {
                if (cst1 == nst1 - 1) {
                    System.out.print(ntp1);

                } else {
                    System.out.print(ntp1 + " ");

                }
                ntp1--;
                cst1++;
            }

            int csp = 0;
            while (csp < nsp) {
                System.out.print(" ");
                csp++;
            }

            int cst2 = 0;
            int ntp2 = ntp1 + 1;
            if (row == N + 1) {
                ntp2 = ntp1 + 2;
                cst2 = cst2 + 1;

            }

            while (cst2 < nst1) {
                if (row == N + 1) {
                    System.out.print(" " + ntp2);

                } else {
                    System.out.print(ntp2 + " ");

                }
                ntp2++;
                cst2++;
            }

            row++;
            if (row < N + 1) {
                nsp -= 4;
                nst1++;

            } else if (row == N + 1) {
                nsp = -1;
                nst1++;
            } else {
                nsp += 4;
                nst1--;

            }

            System.out.println();

        }

    }

}
