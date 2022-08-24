package CJPractice.StacksAndQueues.Queue.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImportanceofTime {
    public static void main(String[] args) {
//        int[] c_order = {5, 4, 2, 3, 1};
//        int[] i_order = {5, 2, 1, 4, 3};
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] c_order = new int[N];
        int[] i_order = new int[N];
        for (int i = 0; i < N; i++) {
            c_order[i] = s.nextInt();

        }
        for (int i = 0; i < N; i++) {
            i_order[i] = s.nextInt();
        }
        System.out.println(getTimeTaken(c_order, i_order));


    }

    public static int getTimeTaken(int[] calling_order, int[] ideal_order) {
        int ans = 0;
        Queue<Integer> calling_order_queue = new LinkedList<Integer>();
        for (int i = 0; i < calling_order.length; i++) {
            calling_order_queue.add(calling_order[i]);
        }
        for (int i = 0; i < ideal_order.length; i++) {

            while (true) {
                int head = calling_order_queue.remove();
                if (ideal_order[i] == head) {
                    ans++;
                    break;
                }
                calling_order_queue.add(head);
                ans++;
            }
        }

        return ans;
    }
}

