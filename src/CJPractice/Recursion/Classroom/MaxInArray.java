package CJPractice.Recursion.Classroom;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 80, 40, 5};
        System.out.println(printMax(arr, 0));

    }

    public static int printMax(int[] arr, int i){
        if(i == arr.length){
            return -1 ;
        }

        int max = Math.max(arr[i], printMax(arr, i+1));;
//        System.out.println(max);
        return max;
    }
}
