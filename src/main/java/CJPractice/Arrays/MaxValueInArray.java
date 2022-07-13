package CJPractice.Arrays;

import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(maxValue(arr));
    }

    public static int maxValue(int[] arr) {
        int max_val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max_val < arr[i]){
                max_val = arr[i];
            }
        }
        return max_val;

    }
}
