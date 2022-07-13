package main.java.CJPractice.ArrayList.Classroom;

import java.util.ArrayList;

public class AddTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {9,6,7};
        int[] arr2 = {9,8,7,5}

        addTwoArrays(arr1, arr2);
    }

    public static void addTwoArrays(int[] arr1, int[] arr2){
        int idx1 = arr1.length-1;
        int idx2 = arr2.length-1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int carry = 0;
        while(idx1 >=0 && idx2 >= 0){
            int sum = arr1[idx1] + arr2[idx2] + carry;
            if(sum < 9){
                ans.add(0,sum);
            }
            else{
                ans.add(0,sum%10);
                carry = sum / 10;
            }
            idx1--;
            idx2--;
        }
        //array 1 is smaller
        while(idx2 >= 0){
            int sum = arr2[idx2] + carry;
            if(sum < 9){
                ans.add(0,sum);
            }
            else{
                ans.add(0,sum%10);
                carry = sum / 10;
            }
            idx2 --;

        }
        //array 2 is smaller
        while(idx1 >= 0){
            int sum = arr1[idx1] + carry;
            if(sum < 9){
                ans.add(0,sum);
            }
            else{
                ans.add(0,sum%10);
                carry = sum / 10;
            }
            idx1 --;
        }
        ans.add(0,carry);

        System.out.println(ans);
    }
}
