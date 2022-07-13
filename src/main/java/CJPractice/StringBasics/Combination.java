package CJPractice.StringBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no_test_cases = s.nextInt();
        while(no_test_cases > 0){
            int arr_len = s.nextInt();
            int [] inp_arr = new int[arr_len];
            for (int i = 0; i < arr_len; i++) {
                inp_arr[i] = s.nextInt();
            }
            int amount = s.nextInt();
            pairOfRosesV2(inp_arr, amount);

            no_test_cases --;
        }

//        int[] arr = {10, 2, 6, 8, 4};
//        int max_amount = 10;
//        pairOfRosesV1(arr, max_amount);
//        pairOfRosesV2(arr, max_amount);

    }

    public static void pairOfRosesV1(int[] roses, int target) {
        int R1 = 0;
        int R2 = 0;
        int ans_diff = Integer.MAX_VALUE;
        for (int i = 0; i < roses.length; i++) {
            for (int j = i + 1; j < roses.length; j++) {
                if ((roses[i] + roses[j]) == target) {
                    int diff = Math.abs(roses[i] - roses[j]);
                    if (diff < ans_diff) {
                        ans_diff = diff;
                        R1 = Math.min(roses[i], roses[j]);
                        R2 = Math.max(roses[i], roses[j]);
                    }

                }
            }

        }
        System.out.println("Deepak should buy roses whose prices are " + R1 + " " + R2 + ".");


    }

    public static void pairOfRosesV2(int[] roses, int target) {
        Arrays.sort(roses);
        int left_idx = 0;
        int right_idx = roses.length - 1;
        int rose1 = 0;
        int rose2 = 0;
        while (left_idx < right_idx) {
            int sum = roses[left_idx] + roses[right_idx];
            if (sum == target) {
                rose1 = roses[left_idx];
                rose2 = roses[right_idx];
                left_idx++;
                right_idx--;
            }
            if (sum > target) {
                right_idx--;
            }
            if (sum < target) {
                left_idx++;
            }
        }
        System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");


    }
}
