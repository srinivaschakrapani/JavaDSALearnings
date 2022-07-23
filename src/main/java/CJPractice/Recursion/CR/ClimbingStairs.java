//70. Climbing Stairs
package CJPractice.Recursion.CR;

public class ClimbingStairs {
    public static void main(String[] args) {
//        climbStairs(0, 4, "");
        climbStairsCombination(0, 0, 4, "");

    }

    //Permutation of Steps
    public static void climbStairs(int current_state, int destination, String path) {
        if (current_state == destination) {
            System.out.println(path);
            return;
        }
        if (current_state > destination) {
            return;
        }


        //Jump 1 Step
        climbStairs(current_state + 1, destination, path + 1);
        //Jump 2 Step
        climbStairs(current_state + 2, destination, path + 2);
        //Jump 3 Step
        climbStairs(current_state + 3, destination, path + 3);
    }

    //Combination of Steps
    public static void climbStairsCombination(int current_state, int last_jump, int destination, String path) {
        if (current_state == destination) {
            System.out.println(path);
            return;
        }
        if (current_state > destination) {
            return;
        }


        //Jump 1 Step
        if (last_jump <= 1) {
            climbStairsCombination(current_state + 1, 1, destination, path + 1);

        }

        //Jump 2 Step
        if (last_jump <= 2) {
            climbStairsCombination(current_state + 2, 2, destination, path + 2);

        }
        if (last_jump <= 3) {
            climbStairsCombination(current_state + 3, 3, destination, path + 3);

        }

    }


}
