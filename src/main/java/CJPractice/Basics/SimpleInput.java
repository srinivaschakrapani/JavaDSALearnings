package CJPractice.Basics;//Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.
//
//        Input Format
//        A list of integers to be processed
//
//        Constraints
//        All numbers input are integers between -1000 and 1000.

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while(true){
            int val = s.nextInt();
            sum = sum + val;
            if(sum < 0){
                break;
            }
            System.out.println(val);
        }

    }
}
