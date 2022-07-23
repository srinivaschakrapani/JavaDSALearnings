// 22. Generate Parentheses
// https://leetcode.com/problems/generate-parentheses/
package CJPractice.Recursion.CR;

public class GenerateParentheses {
    public static void main(String[] args) {
        printParanthesis(3, 3, "");

    }

    public static void printParanthesis(int opening_paranthesis, int closing_paranthesis, String path) {
        if (opening_paranthesis == 0 && closing_paranthesis == 0) {
            System.out.println(path);
            return;
        }
        if (opening_paranthesis > closing_paranthesis) {
            return;
        }
        if (opening_paranthesis > 0) {
            printParanthesis(opening_paranthesis - 1, closing_paranthesis, path + "(");

        }
        if (closing_paranthesis > 0) {
            printParanthesis(opening_paranthesis, closing_paranthesis - 1, path + ")");

        }
    }
}
