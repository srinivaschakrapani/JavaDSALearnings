package CJPractice.Recursion.CR;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr, 9);

    }

    public static void printArray(int[] arr , int i){
        if(i == arr.length){
            return;
        }

        //sp
        System.out.println(arr[i]);
        printArray(arr, i+1);

    }
}
