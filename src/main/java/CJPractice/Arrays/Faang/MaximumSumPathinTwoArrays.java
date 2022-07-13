/*
2
8 8
2 3 7 10 12 15 30 34
1 5 7 8 10 15 16 19
3 3
100 101 102
-1 -2 999

*/
package CJPractice.Arrays.Faang;

import java.util.Scanner;


public class MaximumSumPathinTwoArrays {
    public static void main(String[] args) {
//        int[] a1 = {2, 3, 7, 10, 12, 15, 30, 34};
//        int[] a2 = {1, 5, 7, 8, 10, 15, 16, 19};
//        int[] a1 = {1,2,3,4,5,123, 124};
//        int[] a2 = {-2, -1, 0, 1, 122, 123};
//        int[] a1 = {-3, -2, 1, 0, 3};
//        int[] a2 = {-5, -3, 1, 4, 5};

        Scanner s = new Scanner(System.in);
        int no_test_cases = s.nextInt();
        while (no_test_cases > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            for (int i = 0; i < n; i++) {
                arr1[i] = s.nextInt();

            }
            for (int i = 0; i < m; i++) {
                arr2[i] = s.nextInt();
            }

//        arrayIntersection(a1, a2);
//        maxSumPath(a1, a2);
            maxSumPath(arr1, arr2);
            no_test_cases--;
        }
    }

    public static void arrayIntersection(int[] a1, int[] a2) {
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < a1.length && idx2 < a2.length) {
            if (a1[idx1] == a2[idx2]) {
                System.out.println(a1[idx1]);
                idx1++;
                idx2++;
            } else if (a1[idx1] > a2[idx2]) {
                idx2++;

            } else if (a1[idx1] < a2[idx2]) {
                idx1++;

            }
        }
    }

    public static void maxSumPath(int[] a1, int[] a2) {
        int sum_a1 = 0;
        int sum_a2 = 0;
        int idx1 = 0;
        int idx2 = 0;
        int max_sum = 0;

        while (idx1 < a1.length && idx2 < a2.length) {
            if (a1[idx1] == a2[idx2]) {
                max_sum = max_sum + Math.max(sum_a1, sum_a2) + a1[idx1];
                sum_a1 = 0;
                sum_a2 = 0;
                idx1++;
                idx2++;

            } else if (a1[idx1] > a2[idx2]) {
                sum_a2 = sum_a2 + a2[idx2];
                idx2++;
            } else if (a1[idx1] < a2[idx2]) {
                sum_a1 = sum_a1 + a1[idx1];
                idx1++;
            }

        }

        //remaining sum
        for (int i = idx1; i < a1.length; i++) {
            sum_a1 = sum_a1 + a1[i];
        }
        for (int i = idx2; i < a2.length; i++) {
            sum_a2 = sum_a2 + a2[i];
        }
        max_sum = max_sum + Math.max(sum_a1, sum_a2);

//        System.out.println("Max sum is >>> " + max_sum);
        System.out.println(max_sum);

    }
}
