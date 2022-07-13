package CJPractice.Recursion.CR;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {100,10, 20, 80, 40, 5};
        System.out.println(printMax(arr, 0));

    }

    public static int printMax(int[] arr, int i){
        if(i == arr.length){
            return -1 ;
        }

        int sp = printMax(arr, i +1);

        return Math.max(sp, arr[i]);
    }
}
