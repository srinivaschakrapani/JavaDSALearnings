package CJPractice.Recursion.CR;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, "A", "B", "C");


    }

    public static void towerOfHanoi(int no_of_disks, String source, String helper, String destination){
        if (no_of_disks == 0){
            return;
        }


        towerOfHanoi(no_of_disks - 1, source, helper, destination);

        System.out.println("Move " + (no_of_disks) + " disk from " + source + " to " + destination);
        towerOfHanoi(no_of_disks -1 , helper, destination, source);

    }
}
