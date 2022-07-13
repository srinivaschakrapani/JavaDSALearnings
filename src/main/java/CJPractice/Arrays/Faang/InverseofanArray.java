package CJPractice.Arrays.Faang;

import java.util.Scanner;

public class InverseofanArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        inverseThisArray(arr);
    }

    public static void inverseThisArray(int[] arr){
        int l = arr.length;
        int[] newarr = new int[l];
        for (int i = 0; i < l; i++) {
            newarr[arr[i]] = i;
        }
        for (int x : newarr){
            System.out.print(x + " ");
        }
    }
}
