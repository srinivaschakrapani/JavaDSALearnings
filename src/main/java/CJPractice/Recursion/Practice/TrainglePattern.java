package CJPractice.Recursion.Practice;

public class TrainglePattern {
    public static void main(String[] args) {
        printTrainglePattern(5, 0);

    }
    public static void printTrainglePattern(int n, int i){
        if(i == n+1){
            return;
        }

        //Bp : printTrainglePattern(n)
        //SP : printTrainglePattern(n-1)
        //Self work : print i amount of stars

        for (int k = 0; k < i; k++) {
            System.out.print("*\t");
        }
        System.out.println();
        printTrainglePattern(n, i+1);
    }
}
