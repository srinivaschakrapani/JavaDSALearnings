/*
Problemm Stament
How many way we can place K queens in n*n board without any restrictions ?
Ex: 2 by 2 and place 2 Queens (without any restrictions !!)
{0 , 0 }{0 , 1 }
{0 , 0 }{1 , 0 }
{0 , 0 }{1 , 1 }
{0 , 1 }{1 , 0 }
{0 , 1 }{1 , 1 }
{1 , 0 }{1 , 1 }
*/

package CJPractice.Recursion.CR;

public class PlaceQueens2DArray {
    public static void main(String[] args) {
        placeQueens2DArrayCombination(2,2,0,0,2,"");

    }

    public static void placeQueens2DArrayCombination(int num_of_rows, int num_of_cols, int r_idx, int c_idx, int no_of_queens, String path){

        //+Ve base case
        if(no_of_queens == 0){
            System.out.println(path);
            return;
        }
        if(c_idx == num_of_cols){
            c_idx = 0;
            r_idx++;
        }
        if(r_idx == num_of_rows){
            return;
        }

        //Queen ko Bithaya
        placeQueens2DArrayCombination(num_of_rows, num_of_cols, r_idx, c_idx+1,no_of_queens-1, path+"{" + r_idx +" , " + c_idx+" }");
        //Queen ko Nahin Bithaya
        placeQueens2DArrayCombination(num_of_rows, num_of_cols, r_idx, c_idx+1,no_of_queens, path);
    }
}
