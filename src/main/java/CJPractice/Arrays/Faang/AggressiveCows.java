//Spoj :https://www.spoj.com/problems/AGGRCOW/

package CJPractice.Arrays.Faang;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int stalls = s.nextInt();
        int cows = s.nextInt();
        int[] stalls_loc = new int[stalls];
        for (int i = 0; i <stalls_loc.length; i++) {
            stalls_loc[i] = s.nextInt();
        }
        //Linearly
        Arrays.sort(stalls_loc);
        int max_dist = Integer.MIN_VALUE;
        for (int i = 2; i < stalls; i++) {

            if (isPossible(stalls_loc, i, cows)) {
                System.out.println("Cows can be placed at a min distance of " + i + " >>" + true);
                if(max_dist < i){
                    max_dist = i;
                }
            }

        }
        System.out.println(max_dist);


        //Binary Search


//        int[] stalls = {1,2,4,8,9};
//        int cows = 3;
//        isPossible(stalls, 4,cows);


    }

    public static boolean isPossible(int[] stalls, int min_dist_between_cows, int tot_cows) {
        int cows = 1;
        int distance = 0;
        int i = 0;
        //int first_cow = stalls[i];
        int first_stall = stalls[i];
        while (i < stalls.length - 1 && cows < tot_cows) {
            distance = stalls[i + 1] - first_stall;

            if (distance >= min_dist_between_cows) {
                cows++; // agle cow ko bithado
                first_stall = stalls[i + 1]; // cow ka stall hai
                distance = 0;
            }
            i++;
        }
        if (cows == tot_cows) {
//            System.out.println("Cows >>> True >>>" + cows);
            return true;
        } else {
//            System.out.println("Cows >>> False >>>" + cows);
            return false;
        }
    }
}
