package CJPractice.Basics.Patterns;

import java.util.Scanner;

public class PascalTriangle1 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        int N = 4;
//        int N = s.nextInt();
        int row = 0;
        int nsp = N;

        while(row < N){
            int csp = 0;
            while(csp<nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 0;
            int ntp = row;
            int nst = row+1;
            while(cst<nst){
                System.out.print(ncr(row, cst) + " ");
                cst ++;
            }

            row++;
            nsp--;
            System.out.println();
        }

    }

    public static int ncr(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            return fact(n) / (fact(n-r) * fact(r));

        }
    }

    public static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }


}
