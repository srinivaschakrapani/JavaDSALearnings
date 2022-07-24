/*
Placing queens in a chess board such that no 2 queens attack each other
N queens problem !!
 */

package CJPractice.Recursion.CR;

public class QueenCombinationNoAttack {
    public static void main(String[] args) {
        placeQueensNoAttack(8, 8, 0, 0, 8, new boolean[8][8], "");

    }

    public static void placeQueensNoAttack(int no_of_rows, int no_of_cols, int r_idx, int col_idx, int selected_queens, boolean[][] placement_map, String path) {
        if (selected_queens == 0) {
            System.out.println(path);
            return;
        }
        if (col_idx == no_of_cols) {
            r_idx++;
            col_idx = 0;
        }
        if (r_idx == no_of_rows) {
            return;
        }

        //Before placing make sure that it is a safe position
        if (isSafe(placement_map, r_idx, col_idx)) {
            placement_map[r_idx][col_idx] = true;
            placeQueensNoAttack(no_of_rows, no_of_cols, r_idx, col_idx + 1, selected_queens - 1, placement_map, path + "{" + r_idx + "," + col_idx + "}");
            //For backtracking
            placement_map[r_idx][col_idx] = false;
        }
        placeQueensNoAttack(no_of_rows, no_of_cols, r_idx, col_idx + 1, selected_queens, placement_map, path);

    }

    public static boolean isSafe(boolean[][] placed_so_far, int r_idx, int c_idx) {

        //UP
        for (int i = r_idx; i >= 0; i--) {
            if (placed_so_far[i][c_idx]) {
                return false;
            }
        }

        //left
        for (int i = c_idx; i >= 0; i--) {
            if (placed_so_far[r_idx][i]) {
                return false;
            }
        }
        //diaogonal left up
        int r = r_idx;
        int c = c_idx;
        while (r >= 0 && c >= 0) {
            if (placed_so_far[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        //diaogonal right up
        r = r_idx;
        c = c_idx;
        while (r >= 0 && c < placed_so_far[0].length) {
            if (placed_so_far[r][c]) {
                return false;
            }
            r--;
            c++;
        }


        return true;


    }
}
