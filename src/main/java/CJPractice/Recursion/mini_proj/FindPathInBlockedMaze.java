package CJPractice.Recursion.mini_proj;

public class FindPathInBlockedMaze {
    public static void main(String[] args) {
        int[][] maze = {{0, 1, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}};
        boolean[][] visited = new boolean[maze.length][maze[0].length];

        findPathInBlockedMaze(0, 0, 3, 3, maze, "", visited);

    }

    public static void findPathInBlockedMaze(int r_idx, int c_idx, int dest_x, int dest_y, int[][] maze, String path,boolean[][] visited) {
        if (r_idx == dest_x && c_idx == dest_y) {
            System.out.println(path);
            return;
        }
        if (r_idx < 0 || c_idx < 0 || r_idx == maze.length || c_idx == maze[0].length || maze[r_idx][c_idx] == 1 || visited[r_idx][c_idx]) {
            return;
        }

        visited[r_idx][c_idx] = true;

        //UP
        findPathInBlockedMaze(r_idx - 1, c_idx, dest_x, dest_y, maze, path + "U", visited);
        //DOWN
        findPathInBlockedMaze(r_idx + 1, c_idx, dest_x, dest_y, maze, path + "D",visited);
        //RIGHT
        findPathInBlockedMaze(r_idx, c_idx + 1, dest_x, dest_y, maze, path + "R",visited);
        //LEFT
        findPathInBlockedMaze(r_idx, c_idx - 1, dest_x, dest_y, maze, path + "L",visited);

        //Required for backtracking to ensure to reset the path once explored
        visited[r_idx][c_idx] = false;


    }
}
