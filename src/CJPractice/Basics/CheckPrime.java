package CJPractice.Basics;

import java.util.Scanner;

//Take as input a number N, print "CJPractice.Basics.Prime" if it is prime if not Print "Not CJPractice.Basics.Prime".
public class CheckPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inp_num = s.nextInt();
        int factors = 0;
        boolean is_prime = true;

        if(inp_num == 1){
            is_prime = false;
        }
        else{
            int start_val = 2;
            while(start_val < inp_num){
                if(inp_num % start_val == 0){
                    is_prime = false;
                    break;
                }
                start_val = start_val + 1;
            }
        }
        if(is_prime){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not CJPractice.Basics.Prime");
        }
    }
}
