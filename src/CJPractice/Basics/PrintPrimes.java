package CJPractice.Basics;

import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n <= 1){
            ///No OP
        }
        else {
            for(int i = 2; i <= n; i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }

        }
    }


    public static boolean isPrime(int n) {
        int k = n;
        boolean prime = true;
        for(int i = 2; i<k; i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}


