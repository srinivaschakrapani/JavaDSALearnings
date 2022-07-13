package CJPractice.Arrays.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -1};
//        Arrays.sort(arr);
//        System.out.println(Arrays.sort(arr));
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        int to_be_sorted_len = arr.length - 1;
        while (to_be_sorted_len >= 0) {
            for (int i = 0; i < to_be_sorted_len; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            to_be_sorted_len--;
        }

//        System.out.println(Arrays.toString(arr));
    }
}
