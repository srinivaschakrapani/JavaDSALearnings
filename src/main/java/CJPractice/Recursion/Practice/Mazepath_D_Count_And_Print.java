package CJPractice.Recursion.Practice;

import java.util.Scanner;

/*
Input Format
Enter the number of rows N1 and number of columns N2


Constraints
None


Output Format
Display the total number of paths and print all the possible paths in a space separated manner


Sample Input
3
3
Sample Output
VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD
13
 */
public class Mazepath_D_Count_And_Print {
    static int ans = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        printMazePath(N, N, 0, 0, "");
        System.out.println("\n" + ans);

    }

    public static void printMazePath(int max_row_idx, int max_col_idx, int row_idx, int col_idx, String path) {
        if (row_idx == max_row_idx - 1 && col_idx == max_col_idx - 1) {
            ans++;
            System.out.print(path + " ");
            return;
        }
        if (row_idx >= max_row_idx || col_idx >= max_col_idx) {
            return;
        }
        printMazePath(max_row_idx, max_col_idx, row_idx + 1, col_idx, path + "V");

        printMazePath(max_row_idx, max_col_idx, row_idx, col_idx + 1, path + "H");
        if (row_idx == col_idx || row_idx + col_idx == max_col_idx - 1) {
            printMazePath(max_row_idx, max_col_idx, row_idx + 1, col_idx + 1, path + "D");

        }

    }
}
