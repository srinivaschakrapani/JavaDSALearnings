package CJPractice.Recursion.CR;

public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 30, 20};
        System.out.println(lastOccurence(arr, 20, 0));

    }

    public static int lastOccurence(int[] arr, int ele, int idx) {
        //Bp: lastOccurence(arr, ele, 0)
        //SP: lastOccurence(arr, ele, 1) --> 5
        //Self Work: sp == -1 and arr[idx] == ele => return idx
        if (idx == arr.length) {
            return -1;
        }

        int sp = lastOccurence(arr, ele, idx + 1);

        if (sp == -1 && arr[idx] == ele) {
            return idx;
        } else {
            return sp;
        }

    }
}
