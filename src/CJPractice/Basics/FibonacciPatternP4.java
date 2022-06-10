package CJPractice.Basics;

import java.util.Scanner;

public class FibonacciPatternP4 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int row = 1;

        long prev = 0;
        long curr = 1;

//        int count = 1;

        while (row <= N) {
            int nst = row;
            int cst = 0;
            while (cst < nst) {
//                System.out.print("*\t");
                System.out.print(prev + "\t");
//                System.out.println(count + ":" + prev);
                long next = prev + curr;
                prev = curr;
                curr = next;
                cst++;
//                count ++;
            }


            row++;
            nst++;
            System.out.println();
        }
    }
}
