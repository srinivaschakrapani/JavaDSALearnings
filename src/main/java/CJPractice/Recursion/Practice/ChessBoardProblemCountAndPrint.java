package CJPractice.Recursion.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ChessBoardProblemCountAndPrint {
    static int ans = 0;
    static ArrayList<String> al = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int N = 3;
        int N = s.nextInt();
        findPathsChessBoard(N, 0, 0, "{0-0}");
//        System.out.println(ans);
//        System.out.println(al);
        for (String x : al){
            System.out.print(x + " ");
        }
        System.out.println("\n"+al.size());


    }

    public static void findPathsChessBoard(int N, int row_idx, int col_idx, String path) {
        if (col_idx >= N || row_idx >= N) {
            return;

        }
        if (row_idx == N - 1 && col_idx == N - 1) {
//            System.out.println(path);
            if(!al.contains(path)){
                al.add(path);
            }
            ans ++;
            return;
        }

        //Any cell piece moves like a knight
        findPathsChessBoard(N, row_idx + 1, col_idx + 2, path + "K{" + (row_idx + 1) + "-" + (col_idx + 2) + "}");
        findPathsChessBoard(N, row_idx + 2, col_idx + 1, path + "K{" + (row_idx + 2) + "-" + (col_idx + 1) + "}");

        //4 walls Moives like a rook
        if ((row_idx == 0 || row_idx == N - 1) || (col_idx == 0 || col_idx == N - 1)) {
            //Horizontal movement across the row
            for (int i = col_idx; i < N; i++) {
                for (int j = 1; j < N; j++) {
                    findPathsChessBoard(N, row_idx, col_idx + j, path + "R{" + (row_idx) + "-" + (col_idx + j) + "}");
                }

            }
            //Vertical movement
            for (int j = row_idx; j < N; j++) {
                for (int i = 1; i < N; i++) {
                    findPathsChessBoard(N, row_idx + i, col_idx, path + "R{" + (row_idx + i) + "-" + (col_idx) + "}");
                }

            }
        }

        //Diagonals
        //4 walls Moives like a rook
        if ((row_idx == col_idx)) {
            for (int i = 1; i < N; i++) {
                findPathsChessBoard(N, row_idx + i, col_idx + i, path + "B{" + (row_idx + i) + "-" + (col_idx + i) + "}");
            }

        }

    }
}
