package CJPractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
//        int[] arr = {-4,-1,0,3,10};
        Scanner s = new Scanner(System.in);
        int arr_len = s.nextInt();
        int[] arr = new int[arr_len];
        for (int i = 0; i < arr_len; i++) {
            arr[i] = s.nextInt();
        }

        squareAndSort(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }

    public static void squareAndSort(int[] arr) {
        //Square the Array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        System.out.println(Arrays.toString(arr));
        //use selection sort
        int sorted_idx = arr.length - 1;
        while (sorted_idx > 0) {
            int max_index = 0;
            for (int i = 0; i <= sorted_idx; i++) {
                if (arr[max_index] < arr[i]) {
                    max_index = i;
                }
            }
            //Swap the max element to last
            int temp = arr[sorted_idx];
            arr[sorted_idx] = arr[max_index];
            arr[max_index] = temp;

            sorted_idx--;

        }
        System.out.println(Arrays.toString(arr));


    }

}
