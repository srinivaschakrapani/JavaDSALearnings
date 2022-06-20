package CJPractice.Arrays;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr_len = s.nextInt();
        int[] arr = new int[arr_len];
        for (int i = 0; i < arr_len; i++) {
            arr[i] = s.nextInt();
        }
        reverseThisArray(arr);
        for (int i = 0; i < arr_len; i++) {
            System.out.println(arr[i]);

        }

    }

    public static void reverseThisArray(int[] arr) {
        int start_idx = 0;
        int end_idx = arr.length - 1;
        while (start_idx < end_idx) {
            int temp = arr[start_idx];
            arr[start_idx] = arr[end_idx];
            arr[end_idx] = temp;
            start_idx++;
            end_idx--;
        }
    }
}
