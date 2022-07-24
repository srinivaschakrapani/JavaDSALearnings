/*
https://leetcode.com/problems/word-search/
 */
package LeetCode.Medium;

public class WordSearch {
    public static void main(String[] args) {
//        String[][] board = {
//                {"A", "B", "C", "E"},
//                {"S", "F", "C", "S"},
//                {"A", "D", "E", "E"}
//        };
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        boolean[][] visited = new boolean[board.length][board[0].length];
        String word = "SEE";
//        System.out.println(wordSearchV2(0, 0, 0, word, board, visited, ""));

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)){
                    if(wordSearchV2(i, j, 0, word, board, visited, "")){
                        System.out.println("true");
                    }
                }
            }
            
        }

//        String word = "ABCCED";


    }

    public static boolean wordSearchV2(int start_row_idx, int start_col_idx, int pos_to_explore, String word, char[][] board, boolean[][] visited, String res) {

        if (res.equals(word)) {
            System.out.println(res);
            return false;
        }

        if (start_row_idx < 0 || start_col_idx < 0 || start_row_idx == board.length || start_col_idx == board[0].length) {
            return false;
        }

        if (pos_to_explore == word.length() || board[start_row_idx][start_col_idx] != word.charAt(pos_to_explore)) {
            return false;
        }
        if (visited[start_row_idx][start_col_idx]) {
            return false;
        }

        if (pos_to_explore != word.length() && board[start_row_idx][start_col_idx] == word.charAt(pos_to_explore)) {
            res = res + word.charAt(pos_to_explore) +"";

            if(res.equals(word)){
                System.out.println(res);
                return true;
            }
        }

        visited[start_row_idx][start_col_idx] = true;

        if(wordSearchV2(start_row_idx - 1, start_col_idx, pos_to_explore + 1, word, board, visited, res)){
            return true;
        }
        if(wordSearchV2(start_row_idx + 1, start_col_idx, pos_to_explore + 1, word, board, visited, res)){
            return true;
        }
        if(wordSearchV2(start_row_idx, start_col_idx - 1, pos_to_explore + 1, word, board, visited, res)){
            return true;
        }
        if(wordSearchV2(start_row_idx, start_col_idx + 1, pos_to_explore + 1, word, board, visited, res)){
            return true;
        }

        visited[start_row_idx][start_col_idx] = false;

        return false;


    }






/*
    public static boolean wordSearchV1(int start_row_idx, int start_col_idx, int pos_to_explore, String word, String[][] board, boolean[][] visited, String path) {

        //negative BC
        if (start_row_idx < 0 || start_col_idx < 0 || start_row_idx == board.length ||
                start_col_idx == board[0].length || visited[start_row_idx][start_col_idx] || !(board[start_row_idx][start_col_idx].equals("" + word.charAt(pos_to_explore))) ) {
            return false;
        }

        if (pos_to_explore == word.length()) {
            return true;
        }
//        if (board[start_row_idx][start_col_idx].equals("" + word.charAt(pos_to_explore))) {
//            return true;
//        }


        visited[start_row_idx][start_col_idx] = true;

        if (wordSearch(start_row_idx - 1, start_col_idx, pos_to_explore + 1, word, board, visited, path + "U")) {
            return true;
        }
        if (wordSearch(start_row_idx + 1, start_col_idx, pos_to_explore + 1, word, board, visited, path + "D")) {
            return true;
        }
        if (wordSearch(start_row_idx, start_col_idx - 1, pos_to_explore + 1, word, board, visited, path + "L")) {
            return true;
        }
        if (wordSearch(start_row_idx, start_col_idx + 1, pos_to_explore + 1, word, board, visited, path + "R")) {
            return true;
        }

        visited[start_row_idx][start_col_idx] = false;
        return false;

    }


 */


}
