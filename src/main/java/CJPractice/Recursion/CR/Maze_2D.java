package CJPractice.Recursion.CR;

public class Maze_2D {
    public static void main(String[] args) {
        printMazePath(0,0,2,2,"");

    }

    public static void printMazePath(int start_row_idx, int start_col_idx, int dest_row_idx, int dest_col_idx, String path) {
        if (start_row_idx == dest_row_idx && start_col_idx == dest_col_idx) {
            System.out.println(path);
            return;
        }
        //Negative BC
        if (start_row_idx > dest_row_idx || start_col_idx > dest_col_idx) {
            return;
        }

        printMazePath(start_row_idx + 1, start_col_idx, dest_row_idx, dest_col_idx, path + "D");
        printMazePath(start_row_idx, start_col_idx + 1, dest_row_idx, dest_col_idx, path + "R");

    }

}
