package CJPractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplets {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 4, 2, 5, 5};
//        int target = 5;

        Scanner s = new Scanner(System.in);
        int arr_len = s.nextInt();
        int[] arr = new int[arr_len];
        for (int i = 0; i < arr_len; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        targetTripletSum(arr, target);

    }

    public static void targetTripletSum(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            int left_idx = i + 1;
            int right_idx = arr.length - 1;
            while (left_idx < right_idx) {
                int sum = k + arr[left_idx] + arr[right_idx];
                if (sum == target) {
                    System.out.println(k + ", " + arr[left_idx] + " and " + arr[right_idx]);
                    left_idx++;
                    right_idx--;
                }
                if (sum < target) {
                    left_idx++;
                }
                if (sum > target) {
                    right_idx--;
                }

            }


        }
    }

    public static void targetSumV1BruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == target) {
                        int[] temp_arr = {arr[i], arr[j], arr[k]};
                        Arrays.sort(temp_arr);
                        System.out.println(temp_arr[0] + ", " + temp_arr[1] + " and " + temp_arr[2]);
                    }

                }
            }
        }

    }
}
