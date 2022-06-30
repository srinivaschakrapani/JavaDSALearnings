package CJPractice.ArrayList.Classroom;

import java.util.ArrayList;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {5,7,10,10,10,20,30,30,50,60,60,80};
        int[] arr2 ={10,10,15,20,30,30,30,60,70,80,80,90};
        ArrayList<Integer> x = intersection(arr1, arr2);
        System.out.println(x);

    }
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        int idx1 = 0;
        int idx2 = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        while(idx1 < arr1.length && idx2 < arr2.length){
            if(arr1[idx1] == arr2[idx2]){
                ans.add(arr1[idx1]);
                idx1++;
                idx2++;
            } else if (arr1[idx1] > arr2[idx2]) {
                idx2++;
            } else if (arr1[idx1] < arr2[idx2]) {
                idx1++;
            }
        }
        return ans;
    }
}
