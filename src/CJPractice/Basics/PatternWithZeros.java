package CJPractice.Basics;

import java.util.Scanner;

public class PatternWithZeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no_of_rows = s.nextInt();
//        int no_of_rows = 5;
        int row_num = 1;
        while (row_num <= no_of_rows) {
            int cst = 0;
            int nst = row_num;
            while (cst < nst) {
                if (row_num > 2) {
                    if (cst == 0 || cst == nst - 1) {
                        System.out.print(row_num + "\t");
                    } else {
                        System.out.print("0\t");
                    }
                } else {
                    System.out.print(row_num + "\t");
                }
                cst++;
            }
            System.out.println();
            row_num++;
        }
    }

}
