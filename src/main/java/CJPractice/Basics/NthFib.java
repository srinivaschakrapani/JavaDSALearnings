package CJPractice.Basics;

import java.util.Scanner;

public class NthFib {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nthfib = s.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;
        while(count < nthfib){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            count = count + 1;
        }
        System.out.println(a);

//        int k = 2;
//
//        long firstval = 0;
//        long secondval = 1;
//        long nextval = firstval + secondval;
//
//        if(nthfib == 0){
//            System.out.println(firstval);
//        }
//        else if(nthfib == 1){
//            System.out.println(secondval);
//        }
//        else {
//            while(k <= nthfib){
//                nextval = firstval + secondval;
//                firstval = secondval;
//                secondval = nextval;
//                k++;
//            }
//            System.out.println("Next val = " + nextval);
//        }
    }
}
//0 1 1 2 3 5 8
//      P N