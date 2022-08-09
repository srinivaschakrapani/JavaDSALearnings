package CJPractice.Recursion.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Subset_Problem {
    static int no_of_subsets = 0;

    public static void main(String[] args) {
////        int[] arr = {2, 3, 5};
//        int[] arr = {1, 2, 3};
////        int target = 5;
//        int target = 3;

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();

        ArrayList<Integer> al = new ArrayList<Integer>();
        boolean[] visited = new boolean[arr.length];
        subsetsWithKSum(arr, al, 0, visited, target);
        System.out.println("\n" + no_of_subsets);
    }

    public static void subsetsWithKSum(int[] inp_arr, ArrayList<Integer> al, int idx, boolean[] visited, int target) {
        if (idx == inp_arr.length) {
            if (subsetSumMatchesTarget(al, target)) {
//                System.out.println(al);
                for (int x : al){
                    System.out.print(x + " ");
                }
                System.out.print("  ");
                no_of_subsets++;
            }
            return;
        }
        if (!visited[idx]) {
            al.add(inp_arr[idx]);
            visited[idx] = true;
        }

        subsetsWithKSum(inp_arr, al, idx + 1, visited, target);
        visited[idx] = false;
        al.remove(al.size() - 1);

        subsetsWithKSum(inp_arr, al, idx + 1, visited, target);

    }

    public static boolean subsetSumMatchesTarget(ArrayList<Integer> al, int target) {
        int ans = 0;
        for (int x : al) {
            ans += x;
        }
        return ans == target;
    }


}
