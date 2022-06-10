package CJPractice.Basics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        boolean prime = true;
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not CJPractice.Basics.Prime");
        }
    }
}
