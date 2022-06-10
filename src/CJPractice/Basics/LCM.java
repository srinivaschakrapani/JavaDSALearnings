package CJPractice.Basics;

import java.util.Scanner;

//Take the following as input.
//
//        A number (N1)
//        A number (N2)
//        Write a function which returns the CJPractice.Basics.LCM of N1 and N2. Print the value returned.
public class LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n1 = s.nextLong();
        long n2 = s.nextLong();
        long n1_temp = n1;
        long n2_temp = n2;

        int multiplier_n1 = 2;
        int multiplier_n2 = 2;
        System.out.println("n1 = " + n1 + " n2 = " + n2);
        int k = 1;
        while(n1_temp != n2_temp){

            if(n1_temp < n2_temp ){
                n1_temp = n1 * multiplier_n1;
                multiplier_n1 ++ ;
            }
            else{
                n2_temp = n2 * multiplier_n2;
                multiplier_n2 ++ ;
            }
        }
        System.out.println(n1_temp);
    }
}
