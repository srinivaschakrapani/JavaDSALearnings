package CJPractice.Basics;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            char op = s.next().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                int N1 = s.nextInt();
                int N2 = s.nextInt();
                if(op == '+'){
                    System.out.println(N1 + N2);
                }
                else if(op == '-'){
                    System.out.println(N1 - N2);
                }
                else if(op == '*'){
                    System.out.println(N1 * N2);
                }
                else if(op == '/'){
                    System.out.println(N1 / N2);
                }
                else {
                    System.out.println(N1 % N2);
                }

            } else if (op == 'x' || op == 'X') {
                break;
            } else{
                System.out.println("Invalid operation. Try again.");
            }

        }
    }
}
