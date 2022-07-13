package CJPractice.Basics.Patterns;
import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
//        int N = 5;
        int total_rows = 2 * N + 1;
        int rows = 1;
        int nsp1 = 0;
        int nsp2 = 0;
        int nst = total_rows;
        int nts = N;

        while (rows <= total_rows) {
            int csp1 = 0;
            if (rows == 1 || rows == (total_rows)){
                csp1 = 2;
            }

            while (csp1 < nsp1) {
                System.out.print(" ");
                csp1++;
            }

            int cst = 0;
            int ntp = nts;
            while (cst < nst) {
                System.out.print(ntp+" ");
                if (cst < nst / 2) {
                    ntp--;
                } else {
                    ntp++;

                }
                cst++;
            }


            int csp2 = 0;
            if (rows == 1 || rows == (total_rows)){
                csp2 = 2;
            }
            while (csp2 < nsp2) {
                System.out.print(" ");
                csp2++;
            }
            rows++;

            if (rows <= (total_rows / 2) + 1) {
                nsp1+=2;
                nsp2+=2;
                nst -= 2;
                nts--;
            } else {
                nsp1-=2;
                nsp2-=2;
                nst += 2;
                nts++;

            }


            System.out.println();
        }

    }
}
