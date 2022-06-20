package CJPractice.Arrays.Faang;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortJustZeroesandOnes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int arr_len = s.nextInt();
       int [] inp_arr = new int[arr_len];
       for(int i = 0 ; i < arr_len; i++){
           inp_arr[i] = s.nextInt();
       }
//        int[] inp_arr = new int[]{1, 0, 0, 1, 1, 0, 1};
        int st_idx = 0;
        int end_idx = inp_arr.length - 1;

        while (st_idx < end_idx) {
            if (inp_arr[st_idx] == 1 && inp_arr[end_idx] == 0) {
                //Swap
                int temp = inp_arr[end_idx];
                inp_arr[end_idx] = inp_arr[st_idx];
                inp_arr[st_idx] = temp;
                st_idx++;
                end_idx--;
            } else if (inp_arr[st_idx] == 0) {
                st_idx++;

            } else if (inp_arr[end_idx] == 1) {
                end_idx--;
            }

        }
        System.out.println(Arrays.toString(inp_arr));
    }
}
