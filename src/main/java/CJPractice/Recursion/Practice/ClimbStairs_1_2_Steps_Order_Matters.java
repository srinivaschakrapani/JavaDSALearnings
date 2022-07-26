package CJPractice.Recursion.Practice;

import java.util.Scanner;

public class ClimbStairs_1_2_Steps_Order_Matters {
    static int ans1 = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        var x = climbStairsDistinctPaths(0, 1, N, "");
        System.out.println(x);
        System.out.println(ans1);

    }

    public static int climbStairsDistinctPaths(int current_step, int step_taken, int dest_step, String path) {

        //Negative Base case
        if (current_step > dest_step) {
            return 0;
        }
        //+ve base case
        if (current_step == dest_step) {
            System.out.println(path);
            ans1++;
            return 1;
        }
        //Bigger Problem  => Climb N stairs
        //Smaller Problem => Climb N-1 Stairs
        //Self work Climb 1 stair / 2 stair

        //Take 1 step
        int sp1 = climbStairsDistinctPaths(current_step + 1, 1, dest_step, path + "1");

        //Take 2 steps
        int sp2 = climbStairsDistinctPaths(current_step + 2, 2, dest_step, path + "2");
        int ans = sp1 + sp2;

        return ans;


    }
}
