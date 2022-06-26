package CJPractice.Arrays.Faang;
//A circular array can be written as a combination of Linear arrays
import java.util.Arrays;
import java.util.Scanner;

public class MaximumCircularSum {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int no_test_cases = s.nextInt();
//        while (no_test_cases > 0) {
//            int N = s.nextInt();
//            int[] arr = new int[N];
//            for (int i = 0; i <N; i++) {
//                arr[i] = s.nextInt();
//            }
//            maxCircularSum(arr);
//
//            no_test_cases--;
//        }
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        int[] arr1 = {10, -3, -4, 7, 6, 5, -4, -1};
        int[] arr2 = {-1, 40, -14, 7, 6, 5, -4, -1};
        maxCircularSum(arr);
        maxCircularSum(arr1);
        maxCircularSum(arr2);
    }

    public static void maxCircularSum(int[] arr) {
        //Expand circular array to Linear array and apply Kadanis algo
        int[] newarr = new int[arr.length * 2 - 1];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i % (arr.length)];
        }
        //Kadanis algo
        int max_sum = Integer.MIN_VALUE;
        int local_sum = 0;
        for (int i = 0; i < newarr.length; i++) {
            local_sum = local_sum + newarr[i];
            max_sum = Math.max(max_sum, local_sum);

            if (local_sum < 0) {
                local_sum = 0;
            }
        }
        System.out.println(Arrays.toString(newarr));
        System.out.println(max_sum);
    }
}
