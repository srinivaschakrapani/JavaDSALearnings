package CJPractice.Recursion.CR;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {15,25,35,55};
        Arrays.toString(merge(arr1, arr2));


    }
    public static int[] merge(int[] arr1, int[] arr2){
        int idx_1 = 0;
        int idx_2 = 0;
        int i = 0;
        int[] arr = new int[arr1.length+arr2.length];

        while(idx_1 < arr1.length && idx_2 < arr2.length){
            if(arr1[idx_1] >= arr2[idx_2]){
                arr[i] = arr1[idx_1];
                idx_2 ++;

            }
            if(arr1[idx_1] < arr2[idx_2]){
                arr[i] = arr1[idx_1];
                idx_1++;
            }
            i++;
        }
        while(idx_1 < arr1.length){
            arr[i] = arr1[idx_1];
            idx_1++;

        }
        while(idx_2 < arr2.length){
            arr[i] = arr1[idx_1];
            idx_2++;

        }

        return arr;
    }
}
