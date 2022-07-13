package CJPractice.Arrays;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr_len = s.nextInt();
        long[] arr = new long[arr_len];
        for (int i = 0; i < arr_len; i++) {
            arr[i] = s.nextLong();
        }
        productExceptSelfV1(arr);


    }

    public static void productExceptSelfV1(long[] arr) {
        long product;
        long[] new_arr = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (j!= i) {
                    product = product * arr[j];
                }
            }
            new_arr[i] = product;
        }
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i] + " ");
        }
    }
}
