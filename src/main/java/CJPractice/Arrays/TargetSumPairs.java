package CJPractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairs {
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
        targetSumWithSorting(arr, target);

    }

    public static void targetSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    if (arr[i] > arr[j]) {
                        System.out.println(arr[j] + " and " + arr[i]);
                    } else {
                        System.out.println(arr[i] + " and " + arr[j]);
                    }
                }
            }
        }

    }

    public static void targetSumWithSorting(int[] arr, int target) {
        Arrays.sort(arr);
        int left_idx = 0;
        int right_idx = arr.length - 1;
        while(left_idx < right_idx){
            int sum = arr[left_idx] + arr[right_idx];
            if(sum == target){
                System.out.println(arr[left_idx] +" and " + arr[right_idx]);
                left_idx ++;
                right_idx --;
            }
            if(sum > target){
                right_idx --;
            }
            if(sum < target){
                left_idx ++;
            }

        }

    }
}
