package CJPractice.Recursion.Practice;

import java.util.Scanner;
import java.util.Stack;

public class TheCelebrityProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int N = 4;
        int N = s.nextInt();
        int[][] person_knows = new int[N][];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                person_knows[i][j] = s.nextInt();

            }

        }
//        int[][] person_knows = {{0, 0, 1, 0},
//                {0, 0, 1, 0},
//                {0, 1, 0, 0},
//                {0, 0, 1, 0},
//        };

        Stack<Integer> stk = new Stack<Integer>();
        for (int i = 0; i < N; i++) {
            stk.push(i);
        }
        while (!stk.isEmpty()) {
            if (stk.size() >= 2) {
                //pop 2 persons
                int p1 = stk.pop();
                int p2 = stk.pop();

                if (person_knows[p1][p2] == 1) {
                    stk.push(p2);
                } else {
                    stk.push(p1);
                }
            } else {
                //one person in stack, check
                int p = stk.pop();
                for (int i = 0; i < N; i++) {
                    if(person_knows[p][i] == 1){
                        System.out.println("No Celebrity");
                        return;
                    }
                }
                System.out.println(p);
            }
        }


    }

}
