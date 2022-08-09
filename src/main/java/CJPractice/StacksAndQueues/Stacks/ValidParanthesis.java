package CJPractice.StacksAndQueues.Stacks;
/*
https://leetcode.com/problems/valid-parentheses/submissions/
 */
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        isValidParanthesis("()[]{}");
        isValidParanthesis("([]{]");

    }

    public static boolean isValidParanthesis(String inp_str) {
        Stack<String> inp_stk = new Stack<String>();
        for (int i = 0; i < inp_str.length(); i++) {
//            if(inp_stk.isEmpty()){
//                continue;
//            }
            String to_look = inp_str.substring(i, i + 1);
            if (!inp_stk.isEmpty()) {
                String tos = inp_stk.peek();
                if (
                        (to_look.equals(")") && tos.equals("(")) ||
                                (to_look.equals("]") && tos.equals("[")) ||
                                (to_look.equals("}") && tos.equals("{"))

                ) {
                    inp_stk.pop();
                } else {
                    inp_stk.push(to_look);
                }

            } else {
                inp_stk.push(to_look);
            }

        }
        if (inp_stk.isEmpty()) {
            System.out.println("TRUE");
            return true;
        } else {
            System.out.println("FALSE");
            return false;
        }
    }
}
