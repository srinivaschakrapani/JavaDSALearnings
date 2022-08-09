package CJPractice.Recursion.Practice;

import java.util.Scanner;

/*
Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders).

Take as input M, a number. M is the number of faces of the dice.

Input Format
number N (size of the board) and number M(number of the faces of a dice)

Output Format
Display the number of paths and print all the paths in a space separated manner


Sample Input
3
3

Sample Output
111 12 21 3
4
 */
public class Boardpath_Count_Print {
    static int ans = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int board_size = 3;
//        int dice_size = 3;
        int board_size = s.nextInt();
        int dice_size = s.nextInt();

        getBoardPath(board_size, 0, "", dice_size);
        System.out.println("\n" + ans);

    }

    public static void getBoardPath(int board_max_pos, int curr_location, String path, int dice_size) {
        if (curr_location > board_max_pos) {
            return;
        }
        if (curr_location == board_max_pos) {
            System.out.print(path + " ");
            ans++;
            return;
        }
        for (int i = 1; i <= dice_size; i++) {
            getBoardPath(board_max_pos, curr_location + i, path + i, dice_size);

        }

    }

}
