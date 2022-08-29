package CJPractice.Recursion.Practice;

import java.util.ArrayList;

public class ChessBoardProblemCountAndPrint {
    static ArrayList<String> al = new ArrayList<String>();

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        int N = 4;
//        int N = s.nextInt();
        findPathsChessBoard(N, 0, 0, "{0-0}");
//        System.out.println(ans);
//        System.out.println(al);
        for (String x : al) {
            System.out.print(x + " ");
        }
        System.out.println("\n" + al.size());


    }

    public static void findPathsChessBoard(int N, int row_idx, int col_idx, String path) {
        if (col_idx >= N || row_idx >= N) {
            return;

        }
        if (row_idx == N - 1 && col_idx == N - 1) {
            System.out.println(path);
            if (!al.contains(path)) {
                al.add(path);
            } else {
                System.out.println("Duplicate");
            }
            return;
        }

        //Any cell piece moves like a knight
        findPathsChessBoard(N, row_idx + 1, col_idx + 2, path + "K{" + (row_idx + 1) + "-" + (col_idx + 2) + "}");
        findPathsChessBoard(N, row_idx + 2, col_idx + 1, path + "K{" + (row_idx + 2) + "-" + (col_idx + 1) + "}");

        //4 walls Moives like a rook
        if ((row_idx == 0 || row_idx == N - 1) || (col_idx == 0 || col_idx == N - 1)) {
            //Horizontal movement
            for (int i = 1; i <= N - col_idx - 1; i++) {
                findPathsChessBoard(N, row_idx, col_idx + i, path + "R{" + (row_idx) + "-" + (col_idx + i) + "}");
            }

            //Vertical movement
            for (int j = 1; j <= N - row_idx - 1; j++) {
                findPathsChessBoard(N, row_idx + j, col_idx, path + "R{" + (row_idx + j) + "-" + (col_idx) + "}");
            }
        }

        //Diagonals Moves like a bishop
        if ((row_idx == col_idx) || (row_idx + col_idx) == N - 1) {
            int step = 1;
            int i = row_idx;
            int j = col_idx;
            while (i < N && j < N) {
                findPathsChessBoard(N, row_idx + step, col_idx + step, path + "B{" + (row_idx + step) + "-" + (col_idx + step) + "}");
                i++;
                j++;
                step++;
            }

        }

    }
}
