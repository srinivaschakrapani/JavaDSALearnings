package CJPractice.Recursion.Faang;

import java.util.Arrays;

public class ContainerContainingMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        containerWithMostWaterBruteForceV1(height);
        containerWithMostWaterV2(height);

    }

    public static void containerWithMostWaterBruteForceV1(int[] arr) {
        int max_area = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
//            int local_max_area = 0;
            for (int j = i + 1; j < arr.length; j++) {
                max_area = Math.max(max_area, Math.min(arr[i], arr[j]) * (j - i));
            }
        }
        System.out.println(max_area);
    }

    //Better approach ?
    public static void containerWithMostWaterV2(int[] arr) {
        int start_idx = 0;
        int end_idx = arr.length - 1;
        int max_area = Integer.MIN_VALUE;
        while (start_idx < end_idx) {
            max_area = Math.max(max_area, Math.min(arr[start_idx], arr[end_idx]) * (end_idx - start_idx));
            if(arr[start_idx] <= arr[end_idx]){
                start_idx ++;
            }
            else if(arr[end_idx] < arr[start_idx]){
                end_idx--;
            }

        }
        System.out.println(max_area);
    }

}
