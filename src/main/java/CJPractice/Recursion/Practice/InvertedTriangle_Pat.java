package CJPractice.Recursion.Practice;

import java.util.Scanner;

/*
Take as input N, a number. Print the following pattern (for N = 5)

       *    *   *   *   *
       *    *   *   *
       *    *   *
       *    *
       *
 */
public class InvertedTriangle_Pat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        inverted_Triangle(N);
    }
    public static void inverted_Triangle(int N){
        if(N==0){
            return;
        }
        for (int i = 0; i < N; i++) {
            System.out.print("*" + "\t");
        }
        System.out.println();
        inverted_Triangle(N-1);
    }
}
