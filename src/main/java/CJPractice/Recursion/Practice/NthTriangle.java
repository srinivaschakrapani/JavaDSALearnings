package CJPractice.Recursion.Practice;

public class NthTriangle {
    public static void main(String[] args) {

        System.out.println(NthTriangle(5,1));

    }

    public static int NthTriangle(int n, int i){
        if(i==n){
            return n;
        }
//        System.out.println("Computing " + i + "+ ");
        return i + NthTriangle(n, i+1);
    }
}
