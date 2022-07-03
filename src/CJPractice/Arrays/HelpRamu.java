/*

 */
package CJPractice.Arrays;

import java.util.Scanner;

public class HelpRamu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no_of_test_cases = s.nextInt();
        while (no_of_test_cases > 0) {
            int c1 = s.nextInt(); //A ticket for one ride on some rickshaw or cab. It costs c1 ruppees;
            int c2 = s.nextInt(); //A ticket for an unlimited number of rides on some rickshaw or on some cab. It costs c2 ruppees;
            int c3 = s.nextInt(); //A ticket for an unlimited number of rides on all rickshaws or all cabs. It costs c3 ruppees;
            int c4 = s.nextInt(); //A ticket for an unlimited number of rides on all rickshaws and cabs. It costs c4 ruppees.
            int no_of_times_rickshaw = s.nextInt();
            int[] rickshaw = new int[no_of_times_rickshaw];
            int no_of_times_auto = s.nextInt();
            for (int i = 0; i < no_of_times_rickshaw; i++) {
                rickshaw[i] = s.nextInt();
            }

            int[] autos = new int[no_of_times_auto];
            for (int i = 0; i < no_of_times_auto; i++) {
                autos[i] = s.nextInt();
            }
            System.out.println(minSumOfRupees(rickshaw, autos, c1, c2, c3, c4));

            no_of_test_cases--;
        }

    }

    public static int minSumOfRupees(int[] ricks, int[] auto, int c1, int c2, int c3, int c4) {
        int min_auto_cost = 0;
        int min_ricks_cost_final = 0;

        //Rickshaw cost
        for (int i = 0; i < ricks.length; i++) {
            min_ricks_cost_final += Math.min(ricks[i] * c1, c2);
        }
        min_ricks_cost_final = Math.min(min_ricks_cost_final, c3);

        //Autos Cost
        for (int i = 0; i < auto.length; i++) {
            min_auto_cost += Math.min(auto[i] * c1, c2);

        }
        min_auto_cost = Math.min(min_auto_cost, c3);

        return Math.min(min_ricks_cost_final+ min_auto_cost , c4);

    }
}
