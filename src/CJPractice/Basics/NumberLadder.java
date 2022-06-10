package CJPractice.Basics;

import java.util.Scanner;

public class NumberLadder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
//        int N = 4;
        int row = 1;
        int nst = 1;
        int srn = 1;
        int ntp = srn;
        while(row <= N){
            int cst = 0;
            while(cst < nst){
                System.out.print(ntp+"\t");
                cst ++;
                ntp++;
            }
            nst++;
            row ++;
            System.out.println();
        }
    }
}
