package CJPractice.Recursion.Classroom;

public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println(nthFibonacciNumber(14));
    }
public static long nthFibonacciNumber(int n){
    if(n <=1){
        return n;
    }
    //Smaller Problem
    long sp1 = nthFibonacciNumber(n-1);
    long sp2 = nthFibonacciNumber(n-2);
    return sp1 + sp2;

}
}
