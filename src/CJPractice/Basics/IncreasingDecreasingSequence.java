package CJPractice.Basics;

import java.util.Scanner;

public class IncreasingDecreasingSequence {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        int prev = Integer.MAX_VALUE;
        int state = 0;
        boolean failed = false;

        boolean output_val = false;

        while(count > 0){
            int inp_num = s.nextInt();
            if(inp_num < prev && state == 0) {
            }
            else if(inp_num > prev && state == 0){
                state = 1;
            }
            else if((inp_num < prev) && state == 1){
                failed = true;
                System.out.println("false");
                break;
            }
            else if (inp_num == prev){
                System.out.println("false");
                failed = true;
                break;
            }
            else{

            }
            prev=inp_num;
            count --;
        }
        if(!failed){
            System.out.println("true");
        }
    }
}
