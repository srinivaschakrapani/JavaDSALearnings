package CJPractice.Arrays.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ele_cnt = s.nextInt();
        int[] arr = new int[ele_cnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int search_key = s.nextInt();
        System.out.println(linearSearch(arr, search_key));
    }

    public static int linearSearch(int[] arr, int search_key) {
        int search_idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search_key) {
                search_idx = i;
                break;
            }
        }
        return search_idx;
    }
}
