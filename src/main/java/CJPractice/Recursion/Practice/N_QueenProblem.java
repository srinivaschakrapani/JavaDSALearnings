package CJPractice.Recursion.Practice;

public class N_QueenProblem {
    static int count = 0;
    public static void main(String[] args) {
        int N = 4;
        boolean[][] placed_queens_map = new boolean[N][N];
        placeNQueens(N, N, 0, 0, N, placed_queens_map, "");
        System.out.println();
        System.out.println(count);

    }

    public static void placeNQueens(int number_of_rows, int number_of_cols, int row_idx, int col_idx, int no_of_queens, boolean[][] placement_loc, String path) {

        if (no_of_queens == 0) {
            System.out.print(path + " ");
            count++;
            return;
        }
        if (col_idx == number_of_cols) {
            col_idx = 0;
            row_idx++;
        }

        if (row_idx == number_of_rows || placement_loc[row_idx][col_idx]) {
            return;
        }

        if (isSafe(placement_loc, row_idx, col_idx)) {
            placement_loc[row_idx][col_idx] = true;
            placeNQueens(number_of_rows, number_of_cols, row_idx, col_idx + 1, no_of_queens - 1, placement_loc, path + "{" + (row_idx+1) + "-" + (col_idx+1) + "} ");
            placement_loc[row_idx][col_idx] = false;
        }

        placeNQueens(number_of_rows, number_of_cols, row_idx, col_idx + 1, no_of_queens, placement_loc, path);


    }

    public static boolean isSafe(boolean[][] placedment_loc, int r_idx, int c_idx) {
        //Look towards left
        for (int i = 0; i <= c_idx; i++) {
            if (placedment_loc[r_idx][i]) {
                return false;
            }
        }

        //Look above if any queen exists
        for (int i = 0; i <= r_idx; i++) {
            if (placedment_loc[i][c_idx]) {
                return false;
            }
        }

        //Diagonal top left
        int r = r_idx;
        int c = c_idx;

        while (r >= 0 && c >= 0) {
            if (placedment_loc[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        r = r_idx;
        c = c_idx;

        while (r >= 0 && c < placedment_loc[0].length) {
            if (placedment_loc[r][c]) {
                return false;
            }
            r--;
            c++;
        }


        return true;
    }
}
