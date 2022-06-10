package CJPractice.Basics;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char inp_char = s.next().charAt(0);
        if((inp_char >= 'a') && (inp_char <= 'z')){
            System.out.println("lowercase");
        }
        else if((inp_char >= 'A') && (inp_char <= 'Z')){
            System.out.println("UPPERCASE");
        }
        else{
            System.out.println("Invalid");

        }
    }
}
