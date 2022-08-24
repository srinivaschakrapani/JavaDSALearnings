package CJPractice.StacksAndQueues.Queue.Practice;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int N = 5;
        int N = s.nextInt();
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        for (int i = 0; i < N; i++) {
            s1.push(i);
        }
//        System.out.println(s1);
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        while(!s2.isEmpty())
        {
            System.out.print(s2.pop() + " ");
        }
    }
}
