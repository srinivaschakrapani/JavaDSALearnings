package CJPractice.Recursion.CR;

public class PrintReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        printArrV2(arr, 0);
    }

    public static void printArrV2(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        printArrV2(arr, i+1);
        System.out.println(arr[i]);

    }
}
