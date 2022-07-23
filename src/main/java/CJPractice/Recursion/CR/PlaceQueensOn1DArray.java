/*
Placing k queens in a 1D array of size N ,
No explicit condition as to whether they will kill each other
 */
package CJPractice.Recursion.CR;

public class PlaceQueensOn1DArray {
    public static void main(String[] args) {
        queenPlacementInArrayCombination(10, 0, 3, "");
    }

    public static void queenPlacementInArrayCombination(int no_of_columns, int pos, int no_of_queens, String path) {
        if (no_of_queens == 0) {
            System.out.println(path);
            return;
        }
        if (no_of_columns == pos) {
            return;
        }


        queenPlacementInArrayCombination(no_of_columns, pos + 1, no_of_queens - 1, path + "q" + pos);
        queenPlacementInArrayCombination(no_of_columns, pos + 1, no_of_queens, path);
    }
}
