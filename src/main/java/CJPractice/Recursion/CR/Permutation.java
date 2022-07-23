package CJPractice.Recursion.CR;

//Permutating k boxes out of n
public class Permutation {
    public static void main(String[] args) {
        permutation(10, 2, new boolean[10], "");


    }

    public static void permutation(int total_boxes, int select_boxes, boolean[] selected, String path) {
        if (select_boxes == 0) {
            System.out.println(path);
            return;
        }


        for (int i = 0; i < total_boxes; i++) {
            if (!selected[i]) {
                selected[i] = true;
                permutation(total_boxes, select_boxes - 1, selected, path + "b" + i);
                selected[i] = false;

            }
        }


    }
}
