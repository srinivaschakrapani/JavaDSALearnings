package CJPractice.Recursion.CR;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 30, 20};
//        System.out.println(firstOccurence(arr, 10, 0));
//        System.out.println(firstOccurence(arr, 10, 2));
//        System.out.println(firstOccurence(arr, 10, 4));
//        System.out.println(lastOccurence(arr, 10, 0));

    }


    public static int firstOccurence(int[] arr, int ele, int idx) {
        //Bp: firstOccurence(arr, 10, 0)
        //SP: firstOccurence(arr, 10, 1)
        //Self work : arr[idx] == ele ? return ele
        if (idx == arr.length) {
            return -1;
        }

        int sp = firstOccurence(arr, 10, idx + 1);
        if (arr[idx] == ele) {
            return idx;
        }
        return sp;


    }


}


