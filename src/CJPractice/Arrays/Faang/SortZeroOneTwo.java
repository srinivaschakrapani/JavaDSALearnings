package CJPractice.Arrays.Faang;

import java.util.Arrays;
import java.util.Scanner;

public class SortZeroOneTwo {
    public static void main(String[] args) {
//        int[] a = {2, 0, 2, 1, 1, 0};
//        int[] a = {2,2, 0, 1};
//        int[] a = {2,2, 2, 1};
        Scanner s = new Scanner(System.in);

        int ele_count = s.nextInt();
        int[] arr = new int[ele_count];
        for(int i = 0; i < ele_count; i ++){
            arr[i] = s.nextInt();
        }

        linearSort(arr);

        for(int val : arr){
            System.out.print(val + " ");
        }
    }

    public static void linearSort(int[] arr) {
        int left_idx = 0;
        int right_idx = arr.length - 1;

        while(left_idx < right_idx){
            if (arr[left_idx] != 0 && arr[right_idx] ==0) {
                int temp = arr[left_idx];
                arr[left_idx] = arr[right_idx];
                arr[right_idx] = temp;
            } else if (arr[left_idx] == 0) {
                left_idx++;
            } else if (arr[right_idx] !=0) {
                right_idx--;
            }
        }

//        System.out.println(Arrays.toString(arr));
//        System.out.println("Left Index >>" + left_idx);
//        System.out.println("Right Index >>" + right_idx);
//
        right_idx = arr.length - 1;

        while(left_idx < right_idx){
            if (arr[left_idx] != 1 && arr[right_idx] == 1) {
                int temp = arr[left_idx];
                arr[left_idx] = arr[right_idx];
                arr[right_idx] = temp;
            } else if (arr[left_idx] == 1) {
                left_idx++;
            } else if (arr[right_idx] == 2) {
                right_idx--;
            }
        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Left Index >>" + left_idx);
//        System.out.println("Right Index >>" + right_idx);

    }
}
