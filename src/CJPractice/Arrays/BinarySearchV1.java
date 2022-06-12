package CJPractice.Arrays;

public class BinarySearchV1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 14, 19, 98, 99, 900};
//        System.out.println(binarySearch(arr, 21));
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 99));
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 900));


    }

    public static int binarySearch(int[] arr, int ele) {
        System.out.println("======= Start Binary Search ======== ");
        System.out.println("======= Search element  >>> " + ele);
        int start = 0;
        int end = arr.length - 1;
        int idx = -1;
        while (start <= end) {
            System.out.println("Search area >> " + start + " >> " + end);
            int mid = (start + end) / 2;
            if (ele > arr[mid]) {
                start = mid + 1;
            } else if (ele < arr[mid]) {
                end = mid - 1;
            }
            else{
                idx = mid;
                System.out.println("======= Element " + ele + " Found at >> " + idx);
                break;
            }

        }
        System.out.println("======= End Binary Search ======== ");
        return idx;

    }
}
