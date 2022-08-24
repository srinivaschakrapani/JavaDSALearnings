package CJPractice.Recursion.Practice;

import java.util.Scanner;

public class SudokuSolver {
    static boolean solved = false;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        int N = 9;
        int N = s.nextInt();
        int[][] sudoku_grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sudoku_grid[i][j] = s.nextInt();

            }

        }
//        int[][] sudoku_grid = {
//                {5, 3, 0, 0, 7, 0, 0, 0, 0},
//                {6, 0, 0, 1, 9, 5, 0, 0, 0},
//                {0, 9, 8, 0, 0, 0, 0, 6, 0},
//                {8, 0, 0, 0, 6, 0, 0, 0, 3},
//                {4, 0, 0, 8, 0, 3, 0, 0, 1},
//                {7, 0, 0, 0, 2, 0, 0, 0, 6},
//                {0, 6, 0, 0, 0, 0, 2, 8, 0},
//                {0, 0, 0, 4, 1, 9, 0, 0, 5},
//                {0, 0, 0, 0, 8, 0, 0, 7, 9}};
        solveSudoku(N, N, 0, 0, sudoku_grid);
    }

    public static void solveSudoku(int total_rows, int total_cols, int row_idx, int col_idx, int[][] sudoku_grid) {
        if (col_idx == total_cols) {
//            System.out.println("col_idx ==" + col_idx);
            col_idx = 0;
            row_idx++;

        }
        if (row_idx == total_rows) {
//            System.out.println("row_idx ==" + row_idx);
            display(sudoku_grid);
            solved = true;
            return;
        }
        if (sudoku_grid[row_idx][col_idx] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(total_rows, total_cols, row_idx, col_idx, i, sudoku_grid)) {
                    sudoku_grid[row_idx][col_idx] = i;
                    solveSudoku(total_rows, total_cols, row_idx, col_idx + 1, sudoku_grid);
                    if (solved) {
                        return;
                    }
                    sudoku_grid[row_idx][col_idx] = 0;

                }

            }

        } else {
            solveSudoku(total_rows, total_cols, row_idx, col_idx + 1, sudoku_grid);
        }

    }

    public static void display(int[][] sudoku_grid) {
        for (int[] t : sudoku_grid) {
            for (int x : t) {
                System.out.print(x + " ");

            }
            System.out.println();
        }
        System.out.println("=================");
    }

    public static boolean isSafe(int tot_rows, int tot_cols, int r_idx, int col_idx, int no_to_fill, int[][] sudoku_grid) {
        for (int col = 0; col < tot_cols; col++) {
            if (sudoku_grid[r_idx][col] == no_to_fill) {
                return false;
            }
        }

        for (int row = 0; row < tot_rows; row++) {
            if (sudoku_grid[row][col_idx] == no_to_fill) {
                return false;
            }
        }

        int box_r = r_idx / 3;
        int box_c = col_idx / 3;
        for (int row = box_r * 3; row < box_r * 3 + 3; row++) {
            for (int col = box_c * 3; col < box_c * 3 + 3; col++) {
                if (sudoku_grid[row][col] == no_to_fill) {
                    return false;
                }
            }

        }
        return true;
    }

}
