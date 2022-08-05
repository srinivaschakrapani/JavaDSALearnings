package CJPractice.Recursion.Practice;

import java.util.Scanner;

public class GenerateSortedArrays {

    public static void main(String[] args) {
//        int[] arr1 = {10, 15, 25};
//        int[] arr2 = {1, 5, 20, 30};
//        int[] arr1 = {10, 20, 30,40};
//        int[] arr2 = {11, 12, 35, 45};
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        for (int i = 0; i < a; i++) {
            arr1[i] = s.nextInt();
        }
        for (int i = 0; i < b; i++) {
            arr2[i] = s.nextInt();
        }

        printSortedArrays(arr1, arr2, -1, -1, true, "");

    }

    public static void printSortedArrays(int[] arr1, int[] arr2, int idx_1, int idx_2, boolean selec_1, String path) {
        if (idx_1 == arr1.length || idx_2 == arr2.length) {
            //System.out.println(path);
            return;
        }

        if (selec_1) {
            if (!path.isEmpty()) {
                System.out.println(path);

            }
            for (int i = idx_1 + 1; i < arr1.length; i++) {
                if (idx_2 == -1 || arr1[i] > arr2[idx_2]) {
                    printSortedArrays(arr1, arr2, i, idx_2, false, path + " " + arr1[i]);

                }
            }
        } else {
            for (int j = idx_2 + 1; j < arr2.length; j++) {
                if (arr2[j] > arr1[idx_1]) {
                    printSortedArrays(arr1, arr2, idx_1, j, true, path + " " + arr2[j]);

                }
            }


        }
    }
}
