/*
https://leetcode.com/problems/sudoku-solver/
 */
package CJPractice.Recursion.mini_proj;

public class SudokuSolver {
    static boolean solved = false;

    public static void main(String[] args) {
        solved = false;
//        char[][] sudoku_board =
//                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//                };

        char[][] sudoku_board =
                {
                        {'.', '.', '9', '7', '4', '8', '.', '.', '.'},
                        {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '2', '.', '1', '.', '9', '.', '.', '.'},
                        {'.', '.', '7', '.', '.', '.', '2', '4', '.'},
                        {'.', '6', '4', '.', '1', '.', '5', '9', '.'},
                        {'.', '9', '8', '.', '.', '.', '3', '.', '.'},
                        {'.', '.', '.', '8', '.', '3', '.', '2', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.', '6'},
                        {'.', '.', '.', '2', '7', '5', '9', '.', '.'}
                };
        solveSudoku(9, 9, 0, 0, sudoku_board);

        //It will bring back the original board since we are backtracking in Line#44
        for (char[] t : sudoku_board) {
            System.out.println(t);
        }

    }

    public static void solveSudoku(int total_rows, int total_cols, int r_idx, int col_idx, char[][] sudoku_grid) {
        if (col_idx == total_cols) {
            col_idx = 0;
            r_idx++;
        }

        if (r_idx == total_rows) {
            solved = true;
            display(sudoku_grid);
            return;
        }

        //
        if (sudoku_grid[r_idx][col_idx] == '.') {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(r_idx, col_idx, (char) ('0' + i), sudoku_grid)) {
                    //fill the number to a grid
                    sudoku_grid[r_idx][col_idx] = (char) ('0' + i);
                    solveSudoku(total_rows, total_cols, r_idx, col_idx + 1, sudoku_grid);
                    //To ensure that the backk tracking doesnt happen during successful solving
                    if (solved) {
                        return;
                    }

                    //BAck track to ensure that the previous  number filled is reset and is filled with new number
                    sudoku_grid[r_idx][col_idx] = '.';

                }
            }
        } else {
            solveSudoku(total_rows, total_cols, r_idx, col_idx + 1, sudoku_grid);
        }
    }


    public static void display(char[][] sudoku_grid) {
//        for (char[] t : sudoku_grid) {
//            System.out.println(t);
//        }
        System.out.println("=================");
    }

    public static boolean isSafe(int r_idx, int c_idx, char no_to_fill, char[][] sudoku_board) {
        for (int row = 0; row < 9; row++) {
            if (sudoku_board[row][c_idx] == no_to_fill) {
                return false;
            }
        }
        for (int col = 0; col < 9; col++) {
            if (sudoku_board[r_idx][col] == no_to_fill) {
                return false;
            }
        }
        //ensure that the smaller 3*3 grid the number is not repeated
        int boxc_row = r_idx / 3;
        int boxc_col = c_idx / 3;
        for (int i = boxc_row * 3; i < boxc_row * 3 + 3; i++) {
            for (int j = boxc_col * 3; j < boxc_col * 3 + 3; j++) {
                if (sudoku_board[i][j] == no_to_fill) {
                    return false;
                }

            }

        }
        return true;
    }
}
