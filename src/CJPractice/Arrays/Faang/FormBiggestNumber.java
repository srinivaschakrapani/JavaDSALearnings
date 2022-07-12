package CJPractice.Arrays.Faang;

import java.util.Arrays;

public class FormBiggestNumber {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//        int no_test_cases = s.nextInt();
//
//        while (no_test_cases > 0) {
//            int size_of_arr = s.nextInt();
//            int[] inp_arr = new int[size_of_arr];
//            for (int i = 0; i < inp_arr.length; i++) {
//                inp_arr[i] = s.nextInt();
//            }
        int[] inp_arr = {1,99999, 34, 3, 98, 9, 76, 45, 4, 99999};
        System.out.println(Arrays.toString(inp_arr));
        selectionSortCustomAlgo(inp_arr);
        System.out.println(Arrays.toString(inp_arr));
        String max = "";
        for (int i = 0; i < inp_arr.length; i++) {
            max = max + inp_arr[i];
        }
        System.out.println(max);

//9,98,76,45,4,34,3,1
//9,98,34,1,3,76,45,4

//            no_test_cases--;
//        }

//        int[] inp_arr = {54, 546, 548, 60};
//        long max = -1;
//        for (int i = 0; i < inp_arr.length; i++) {
//            max = customSortAndMerge(inp_arr[i], max);

    }
//        customSortAndMerge(45, 60);
//        System.out.println(max);


    public static int customSortAndMerge(int num1, int num2) {
        long x = Long.parseLong("" + num1 + num2);
        long y = Long.parseLong("" + num2 + num1);
        return x >= y ? 1 : -1;
    }

    public static void selectionSortCustomAlgo(int[] inp_arr) {
        int sorted_min_ele_idx = inp_arr.length - 1;
//        int current_min_ele_idx = -1;
        while (sorted_min_ele_idx > 0) {
            int current_min_ele_idx = 0;
            for (int i = 0; i <= sorted_min_ele_idx; i++) {
                if (customSortAndMerge(inp_arr[i], inp_arr[current_min_ele_idx]) == -1) {
                    current_min_ele_idx = i;
                }
            }
            if (current_min_ele_idx != sorted_min_ele_idx) {
                int temp = inp_arr[current_min_ele_idx];
                inp_arr[current_min_ele_idx] = inp_arr[sorted_min_ele_idx];
                inp_arr[sorted_min_ele_idx] = temp;
            }

            sorted_min_ele_idx--;
        }


    }
}
