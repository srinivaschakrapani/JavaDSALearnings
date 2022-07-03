package CJPractice.Arrays.Faang;

import java.util.Scanner;

public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no_test_cases = s.nextInt();

        while (no_test_cases > 0) {
            int size_of_arr = s.nextInt();
            int[] inp_arr = new int[size_of_arr];
            for (int i = 0; i < inp_arr.length; i++) {
                inp_arr[i] = s.nextInt();
            }

            long max = -1;
            for (int i = 0; i < inp_arr.length; i++) {
                max = customSortAndMerge(inp_arr[i], max);

            }
            System.out.println(max);

            no_test_cases--;
        }

//        int[] inp_arr = {54, 546, 548, 60};
//        long max = -1;
//        for (int i = 0; i < inp_arr.length; i++) {
//            max = customSortAndMerge(inp_arr[i], max);

        }
//        customSortAndMerge(45, 60);
//        System.out.println(max);


    public static Long customSortAndMerge(long num1, long num2) {
        if (num2 < 0) {
            return num1;
        }
        //form a number num1+num2 and num2 + num1
        long x = Long.parseLong("" + num1 + num2);
        long y = Long.parseLong("" + num2 + num1);
//        System.out.println(x + " >> " + y);
        return Math.max(x, y);

    }
}
