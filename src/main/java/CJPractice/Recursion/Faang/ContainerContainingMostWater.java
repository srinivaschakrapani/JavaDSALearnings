package CJPractice.Recursion.Faang;

import java.util.Arrays;

public class ContainerContainingMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        containerWithMostWaterBruteForceV1(height);
        containerWithMostWaterBruteForceV2(height);

    }

    public static void containerWithMostWaterBruteForceV1(int[] arr) {
        int max_area = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int local_max_area = 0;
            for (int j = i + 1; j < arr.length; j++) {
                local_max_area = Math.min(arr[i], arr[j]) * (j - i);
                if (local_max_area > max_area) {
                    max_area = local_max_area;
                }
            }
        }
        System.out.println(max_area);
    }

    //Better approach ?
    public static void containerWithMostWaterBruteForceV2(int[] arr) {
        Arrays.sort(arr);
        int start_idx = 0;
        int end_idx = arr.length - 1;
        int max_area = Integer.MIN_VALUE;
        while (start_idx < end_idx) {
            int local_max_area = Math.min(arr[start_idx], arr[end_idx]) * (end_idx - start_idx);
            if(local_max_area > max_area){
                max_area = local_max_area;
            }
            if(arr[start_idx] <= arr[end_idx]){
                start_idx ++;
            }
//            if(arr[end_idx] < arr[start_idx]){
//                end_idx--;
//            }

        }
        System.out.println(max_area);
    }

}
