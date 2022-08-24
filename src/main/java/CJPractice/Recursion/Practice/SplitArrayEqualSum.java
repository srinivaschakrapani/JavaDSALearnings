package CJPractice.Recursion.Practice;

import java.util.ArrayList;
import java.util.Scanner;

/*
Input Format
Take as input N, a number. Take N more inputs and store that in an array.


Constraints
None


Output Format
Display all the groups in a comma separated manner and display the number of ways the array can be split


Sample Input
6
1
2
3
3
4
5
Sample Output
1 2 3 3 and 4 5
1 3 5 and 2 3 4
1 3 5 and 2 3 4
2 3 4 and 1 3 5
2 3 4 and 1 3 5
4 5 and 1 2 3 3
6
 */
public class SplitArrayEqualSum {
    static ArrayList<Integer> left_subarr_sum = new ArrayList<Integer>();
    static ArrayList<Integer> right_subarr_sum = new ArrayList<Integer>();
    static int count = 0;

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 3, 4, 5};
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        splitArrayWithEqualSum(arr, 0, 0, 0);
        System.out.println(count);

    }

    public static void splitArrayWithEqualSum(int[] arr, int split_idx, int left_sum, int right_sum) {
        if ((left_subarr_sum.size() != 0 || right_subarr_sum.size() != 0) && left_sum == right_sum && (left_subarr_sum.size() + right_subarr_sum.size() == arr.length)) {
            for (int x : left_subarr_sum){
                System.out.print(x + " ");
            }
            System.out.print("and ");
            for (int x : right_subarr_sum){
                System.out.print(x + " ");
            }
            System.out.println();
            count++;
        }

        if (split_idx == arr.length) {
            return;
        }
        left_subarr_sum.add(arr[split_idx]);
        splitArrayWithEqualSum(arr, split_idx + 1, left_sum + arr[split_idx], right_sum);
        left_subarr_sum.remove(left_subarr_sum.size() - 1);
        right_subarr_sum.add(arr[split_idx]);
        splitArrayWithEqualSum(arr, split_idx + 1, left_sum, right_sum + arr[split_idx]);
        right_subarr_sum.remove(right_subarr_sum.size() - 1);

    }

}
