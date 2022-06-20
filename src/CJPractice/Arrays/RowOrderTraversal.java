package CJPractice.Arrays;

import java.util.Arrays;

public class RowOrderTraversal {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
//        System.out.println(Arrays.toString(arr));
        int col_count = arr[0].length;

        for (int j = 0; j < col_count; j++) {
            for (int row = 0; row < arr.length; row++) {
                int rtp = row;
                if(j%2 == 1){
                    rtp = arr.length - 1 - row;
                }
                System.out.print(arr[rtp][j] + " ");

            }
            System.out.println("========");
        }

    }
}