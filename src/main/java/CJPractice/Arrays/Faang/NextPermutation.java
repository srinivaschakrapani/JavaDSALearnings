/* https://leetcode.com/problems/next-permutation/ */
package CJPractice.Arrays.Faang;

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
//        int N = 3;
//        int arr[] = {1, 2, 3};
//        int[] arr1 = {3, 2, 1};
//        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] arr3 = {9,8,3,5,4,3,2,1};
        Scanner s = new Scanner(System.in);
        int no_test_cases = s.nextInt();
        while(no_test_cases > 0){
            int no_ele = s.nextInt();
            int[] inp_arr = new int[no_ele];
            for (int i = 0; i < no_ele; i++) {
                inp_arr[i] = s.nextInt();
            }
            nextPermutationInplace(inp_arr);
            for (int x : inp_arr){
                System.out.print(x + " ");
            }
            System.out.println();
            no_test_cases--;
        }


    }

    public static void nextPermutationInplace(int[] arr) {
        int last_idx = arr.length - 1;
        int last_but_one_idx = last_idx - 1;
        //  Find the index of the number in the array that is less than the previous number
        //  This is a candidate that needs to be changed
        while (last_but_one_idx >= 0) {
            if (arr[last_but_one_idx] >= arr[last_idx]) {
                last_but_one_idx--;
                last_idx--;
            } else {
                break;

            }
        }
        if (last_but_one_idx < 0) {
            reverseArray(arr, 0, arr.length - 1);
        } else {
            findAndSwapWithNextMaximumIdxOfEle(arr, last_but_one_idx, last_idx, arr.length - 1);
            //Reverse the rest of the elements for the minimum number
            reverseArray(arr, last_but_one_idx + 1, arr.length - 1);
        }


    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void findAndSwapWithNextMaximumIdxOfEle(int[] arr, int ele_idx, int start, int end) {
        int temp_max = Integer.MIN_VALUE;
        int next_max_idx = -1;
        while (start <= end) {
            if (arr[start] > arr[ele_idx] && temp_max < arr[start]) {
                next_max_idx = start;
            }
            start ++;
        }
        //Swap ele_idx with next_max_element
        int temp = arr[ele_idx];
        arr[ele_idx] = arr[next_max_idx];
        arr[next_max_idx] = temp;
    }
}
