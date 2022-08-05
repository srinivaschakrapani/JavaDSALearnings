package CJPractice.Recursion.Practice;

public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        solveTowerOfHanoi(4, "A", "B", "C");
    }

    public static void solveTowerOfHanoi(int no_of_disks, String src, String dest, String intermediate){
        if(no_of_disks == 0){
            return;
        }

        solveTowerOfHanoi(no_of_disks-1, src, intermediate, dest);
        System.out.println("Moving ring "+ no_of_disks +" from " + src + " to " + dest);
        solveTowerOfHanoi(no_of_disks-1, intermediate, dest, src);
    }
}
