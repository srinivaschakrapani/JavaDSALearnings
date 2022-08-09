package CJPractice.Recursion.Practice;

import java.util.Scanner;

/*
Input Format
Single line containing an integral value 'n'.


Constraints
1<=n<=11


Output Format
Print the balanced parentheses strings with every possible solution on new line.


Sample Input
2
Sample Output
()()
(())
 */
public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        printParanthessi(N, N, "");

    }

    public static void printParanthessi(int open, int closed, String path) {

        if (open <= 0 && closed <= 0) {
            System.out.println(path);
            return;
        }

        if(open > closed){
            return;
        }
        if (closed > 0) {
            printParanthessi(open, closed - 1, path + ")");
        }

        if (open > 0) {
            printParanthessi(open - 1, closed, path + "(");

        }


    }
}
