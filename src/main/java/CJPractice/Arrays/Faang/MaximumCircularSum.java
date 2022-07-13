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
        //case 1 Max sum is within the array with no wrap around
        ///Apply kadani
        int max_sum_1 = Integer.MIN_VALUE;
        int local_max = 0;
        for (int x: arr){
            local_max = local_max + x;
            max_sum_1 = Math.max(max_sum_1, local_max);
            if (local_max < 0){
                local_max = 0;
            }
        }

        //Case 2
        // Max sum is wrapped between the array
        // which means there is a chunk of elements which result in negative sum
        //{12, -5, 4, -8, 11} => max sum 11 + 12 = 23

        int total_sum = 0;
        //Flip the sign of the elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -arr[i];
            total_sum += arr[i];
        }
        //Kadanis algo
        int max_sum_2 = Integer.MIN_VALUE;
        local_max = 0;
        for (int i = 0; i < arr.length; i++) {
            local_max = local_max + arr[i];
            max_sum_2 = Math.max(max_sum_2, local_max);
            if (local_max < 0){
                local_max = 0;
            }
        }

        max_sum_2 = -1 * (total_sum - max_sum_2);
//        System.out.println("Maximum sum is >> " + Math.max(max_sum_1, max_sum_2));
        System.out.println(Math.max(max_sum_1, max_sum_2));
    }
}
