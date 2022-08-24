package CJPractice.Recursion.Practice;

import java.util.Scanner;

public class VivekLovesArrayGame {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int no_test_cases = s.nextInt();
        while (no_test_cases > 0) {
            no_test_cases--;
            int N = s.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();

            }
            System.out.println(splitArraysWithEqualSum(arr, 0, arr.length - 1));
        }

    }

    public static int splitArraysWithEqualSum(int[] arr, int start_idx, int end_idx) {
        for (int i = start_idx + 1; i <= end_idx; i++) {
            if (sumOfArray(arr, start_idx, i - 1) == sumOfArray(arr, i, end_idx)) {
                int sp1 = splitArraysWithEqualSum(arr, start_idx, i - 1);
                int sp2 = splitArraysWithEqualSum(arr, i, end_idx);
                return Math.max(sp1, sp2) + 1;
            }

        }
        return 0;
    }

    public static int sumOfArray(int[] arr, int start, int end) {
        int ans = 0;
        for (int i = start; i <= end; i++) {
            ans += arr[i];
        }
        return ans;
    }
}
