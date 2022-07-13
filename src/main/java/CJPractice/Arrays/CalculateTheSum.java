package CJPractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no_ele = s.nextInt();
        int[] arr = new int[no_ele];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

//        int[] arr = {1, 2, 3, 4, 5};
        int no_of_queries = s.nextInt();
        while (no_of_queries > 0) {
            int x = s.nextInt();
            calculateSum(arr, x);
            no_of_queries--;
        }
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        sum = sum % 10000000007L;
        System.out.println(sum);

    }

    public static void calculateSum(int[] arr, int x) {
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i] + arr[Math.floorMod(i - x, arr.length)];
        }
        for (int i = 0; i < newarr.length; i++) {
            arr[i] = newarr[i];
        }
        //System.out.println(Arrays.toString(newarr));
    }
}
