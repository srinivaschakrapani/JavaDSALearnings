package CJPractice.Recursion.Classroom;

public class FirstOccurence {
    public static void main(String[] args) {
int[] arr = {10,20,20,10,30,20};
//        System.out.println(firstOccurence(arr, 10, 0));
//        System.out.println(firstOccurence(arr, 10, 2));
//        System.out.println(firstOccurence(arr, 10, 4));
        System.out.println(lastOccurence(arr, 10, 0));

    }

    public static int firstOccurence(int[] arr, int ele, int idx){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == ele){
            return idx;
        }
        return firstOccurence(arr, ele, idx +1);
    }
    public static int lastOccurence(int[] arr, int ele, int idx){
        if(idx == arr.length){
            return -1;
        }


        if(arr[idx] == ele){
            return lastOccurence(arr, ele, idx +1);
        }
        else{
            return lastOccurence(arr, ele, idx +1);
        }

    }

}
