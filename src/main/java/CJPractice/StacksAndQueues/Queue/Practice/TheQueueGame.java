package CJPractice.StacksAndQueues.Queue.Practice;

import java.util.Scanner;

public class TheQueueGame {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 0, 0, 1, 0, 0};
//        isValidOperationsInQueue(arr);

        Scanner s = new Scanner(System.in);
        int no_test_cases = s.nextInt();
        while (no_test_cases > 0) {
            no_test_cases--;
            int N = s.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }
            isValidOperationsInQueue(arr);
        }

    }

    public static void isValidOperationsInQueue(int[] arr) {
        int push_cnt = 0;
        int pop_cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                push_cnt++;
            } else {
                if (push_cnt > 0) {
                    push_cnt--;
                } else {
                    System.out.println("Invalid");
                    return;
                }
            }
        }
        System.out.println("Valid");
    }
}
