package CJPractice.Arrays.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
//        int a[] = {0, 4, 3, -1, 2, 1, -99};
//        int a[] = {4,3,1,2};


        Scanner s = new Scanner(System.in);
        int arr_len = s.nextInt();
        int[] arr = new int[arr_len];
        for (int i = 0; i < arr_len; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        int sorted_idx = arr.length - 1;
        int swaps = 0;
        while (sorted_idx > 0) {
            int max_idx = 0;
            for (int i = 0; i <= sorted_idx; i++) {
                if (arr[max_idx] < arr[i]) {
                    max_idx = i;
                }

            }
            //Swap the temp
            if (sorted_idx != max_idx) {
                int temp = arr[max_idx];
                arr[max_idx] = arr[sorted_idx];
                arr[sorted_idx] = temp;
                System.out.println("Swapping Pos ===> " + max_idx + " <==> " + sorted_idx);
                swaps++;
            }
            sorted_idx--;

        }
        System.out.println(Arrays.toString(arr) + " Swaps ==> " + swaps);
    }

}

