package CJPractice.Recursion.CR;

import java.util.Arrays;

public class AllOccurences {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 30, 20};
        int[] res = allOccurences(arr, 20, 0, 0);
        System.out.println(Arrays.toString(res));
    }

    public static int[] allOccurences(int[] arr, int ele, int idx, int total_occurences) {
        //BP : allOccurences(int[] arr, 20, 0)
        //SP: allOccurences(int[] arr, 20, 1) ==> []
        if (idx == arr.length) {
            return new int[total_occurences];
        }

        if (arr[idx] == ele) {
            int[] occurences_arr = allOccurences(arr, ele, idx + 1, total_occurences + 1);
            occurences_arr[total_occurences] = idx;
            return occurences_arr;

        } else {
            return allOccurences(arr, ele, idx + 1, total_occurences);
        }

    }
}
