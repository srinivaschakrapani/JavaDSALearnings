package CJPractice.Basics;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            long divisor = s.nextLong();
            long dividend = s.nextLong();
            while(divisor > 0){
                long rem = dividend % divisor;
                dividend = divisor;
                divisor = rem;

            }
            System.out.println(dividend);



    }
}
