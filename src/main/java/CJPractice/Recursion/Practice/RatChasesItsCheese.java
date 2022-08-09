package CJPractice.Recursion.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class RatChasesItsCheese {
    static boolean foundPath = false;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();
//        int N = 5;
//        int M = 4;

        char[][] maze = new char[N][M];
//        String[][] maze = {{"O", "X", "O", "O" },
//                {"O", "O", "O", "X" },
//                {"X", "O", "X", "O" },
//                {"X", "O", "O", "X" },
//                {"X", "X", "O", "O" }
//        };
        for (int i = 0; i < N; i++) {
            maze[i] = s.next().toCharArray();

        }
        boolean[][] visited = new boolean[N][M];
        int[][] ans = new int[N][M];
        findMazePAth(maze, N, M, 0, 0, visited, ans);
        if(!foundPath){
            System.out.println("NO PATH FOUND");
        }
    }

    public static void findMazePAth(char[][] maze, int max_row_idx, int max_col_idx,
                                    int curr_row_idx, int curr_col_idx, boolean[][] visited, int[][] ans) {
        if (curr_row_idx == max_row_idx - 1 && curr_col_idx == max_col_idx - 1) {
            ans[curr_row_idx][curr_col_idx] = 1;
//            System.out.println(Arrays.toString(ans));
            for (int[] x : ans) {
                for (int y : x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }
            foundPath = true;
            return;
        }

        if (curr_row_idx >= max_row_idx || curr_row_idx < 0 || curr_col_idx < 0 || curr_col_idx == max_col_idx
                || maze[curr_row_idx][curr_col_idx] == 'X'
                || visited[curr_row_idx][curr_col_idx]) {

            return;
        }

        if (maze[curr_row_idx][curr_col_idx] == 'O') {
            ans[curr_row_idx][curr_col_idx] = 1;

        }
        //Left , Right , Up or down
        visited[curr_row_idx][curr_col_idx] = true;
        findMazePAth(maze, max_row_idx, max_col_idx, curr_row_idx, curr_col_idx - 1, visited, ans);
        findMazePAth(maze, max_row_idx, max_col_idx, curr_row_idx, curr_col_idx + 1, visited, ans);
        findMazePAth(maze, max_row_idx, max_col_idx, curr_row_idx - 1, curr_col_idx, visited, ans);
        findMazePAth(maze, max_row_idx, max_col_idx, curr_row_idx + 1, curr_col_idx, visited, ans);
        ans[curr_row_idx][curr_col_idx] = 0;
        visited[curr_row_idx][curr_col_idx] = false;

    }
}

