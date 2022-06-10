package CJPractice.Basics;

import java.util.Scanner;

public class MirrorStarPattern {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int N = s.nextInt();
        int N = 9;
        int row = 1;
        int nst = 1;
        int nsp = N/2;
        while(row <= N){
            int csp = 0;
            while(csp < nsp){
                System.out.print("\t");
                csp++;
            }

            int cst = 0;
            while(cst<nst){
                System.out.print("*\t");
                cst ++;
            }
            row++;

            if(row <= (N/2+1)){
                nst += 2;
                nsp--;
            }
            else{
                nst -= 2;
                nsp++;
            }

            System.out.println();
        }
    }
}
