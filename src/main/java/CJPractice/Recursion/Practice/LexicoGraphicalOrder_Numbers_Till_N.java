package CJPractice.Recursion.Practice;

import java.util.Scanner;

/*
Take as input N, a number. Write a recursive function which prints
counting from 0 to N in lexicographical order.
In lexicographical (dictionary) order 10, 100 and 109 will be printed before 11.


Input Format
Enter a number N.


Constraints
None


Output Format
Display all the numbers upto N in a lexicographical order


Sample Input
10
Sample Output
0 1 10 2 3 4 5 6 7 8 9
 */
public class LexicoGraphicalOrder_Numbers_Till_N {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        printLexicographicalOrder(0, N);

    }

    public static void printLexicographicalOrder(int curr, int limit) {
        if (curr > limit) {
            return;
        }
        System.out.println(curr);
        int digit = 0;
        if (curr == 0) {
            digit = 1;
        }
        for (; digit <= 9; digit++) {
            printLexicographicalOrder(curr * 10 + digit, limit);
        }
    }
}
