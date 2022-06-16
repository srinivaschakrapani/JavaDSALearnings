package CJPractice.Arrays;

import java.util.Arrays;

public class RowOrderTraversal {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(Arrays.toString(arr));
        int col_count = arr[0].length;

        for (int j = 0; j < col_count; j++) {
            if (j % 2 == 0) {
                int r_idx = 0;
                while (r_idx < arr.length) {
                    System.out.print(arr[r_idx][j] + " ");
                    r_idx++;
                }
                System.out.println();

            } else {
                int r_idx = arr.length - 1;
                while (r_idx >= 0) {
                    System.out.print(arr[r_idx][j] + " ");
                    r_idx--;
                }
                System.out.println();

            }
        }

    }
}
