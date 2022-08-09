package CJPractice.Recursion.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetsSumToK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        int K = s.nextInt();

//        int[] arr = {1,2,3,2,5,1};
//        int K = 7;
        printSubsetsSumtoK(arr, K,new ArrayList<Integer>(), 0);
    }

    public static void printSubsetsSumtoK(int[] arr, int target_sum, ArrayList<Integer> al, int idx){
        if(idx == arr.length){
//            System.out.println(al);
            if(target_sum == 0){
//                System.out.println(al);
                displayReverse(al);
            }
            return;
        }

        if(target_sum == 0){
//            System.out.println(al);
            displayReverse(al);
            return;
        }

        printSubsetsSumtoK(arr, target_sum, al, idx+1);
        al.add(arr[idx]);
        printSubsetsSumtoK(arr, target_sum-arr[idx], al, idx+1);
        al.remove(al.size() - 1);
    }

    public static void displayReverse(ArrayList<Integer> al){
        for (int i = al.size()-1; i >=0 ; i--) {
            System.out.print(al.get(i) + " ");

        }
        System.out.println();
    }

}
