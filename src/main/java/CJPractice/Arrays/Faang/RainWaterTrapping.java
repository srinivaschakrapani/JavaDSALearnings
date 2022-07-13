package CJPractice.Arrays.Faang;

import java.util.Scanner;

//42. Trapping Rain Water
public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no_of_test_cases = s.nextInt();
        while (no_of_test_cases > 0) {
            int N = s.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }
            quantityOfRainWater(arr);
            no_of_test_cases--;
        }
//        int[] arr = {3, 0, 0, 2, 0, 4};
//        int[] arr1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        quantityOfRainWater(arr);
//        quantityOfRainWater(arr1);

    }

    public static void quantityOfRainWater(int[] arr) {
        int water_stored = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            //find left min
            int left_max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                if (left_max < arr[j]) {
                    left_max = arr[j];
                }
            }
            int right_max = Integer.MIN_VALUE;
            //find right max
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > right_max) {
                    right_max = arr[j];
                }
            }
            if ((Math.min(left_max, right_max) - arr[i]) > 0) {
                water_stored = water_stored + Math.min(left_max, right_max) - arr[i];
            }


        }
//        System.out.println("Water stored is >>> " + water_stored);
        System.out.println(water_stored);

    }
    public static void quantityOfRainWaterNoextraMemory(int[] arr) {
        int water_stored = 0;

        //Compute Left Min

        //Compute right Min

        for (int i = 1; i < arr.length - 1; i++) {
            //find left min
            int left_max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                if (left_max < arr[j]) {
                    left_max = arr[j];
                }
            }
            int right_max = Integer.MIN_VALUE;
            //find right max
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > right_max) {
                    right_max = arr[j];
                }
            }
            if ((Math.min(left_max, right_max) - arr[i]) > 0) {
                water_stored = water_stored + Math.min(left_max, right_max) - arr[i];
            }


        }
//        System.out.println("Water stored is >>> " + water_stored);
        System.out.println(water_stored);

    }
}
