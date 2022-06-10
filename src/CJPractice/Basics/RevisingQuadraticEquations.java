package CJPractice.Basics;

import java.util.Scanner;

public class RevisingQuadraticEquations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int d = (int) Math.pow(b, 2) - (4 * a * c);
        if (d < 0) {
            //No Op
            System.out.println("Imaginary");

        } else {
            //Real roots
            int root1 = (int) (-b + (Math.sqrt(d))) / (2 * a);
            int root2 = (int) (-b - (Math.sqrt(d))) / (2 * a);

            if (d == 0) {
                System.out.println("Real and Equal");
            } else {
                System.out.println("Real and Distinct");
            }
            System.out.println(root2 + " " + root1);
        }
    }

}
