/*

 */

package CJPractice.Arrays.Faang;

import java.util.Scanner;

public class BookAllocationProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no_of_test_cases = s.nextInt();
        while (no_of_test_cases > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[] books_arr = new int[n];
            int max_pages = 0;
            for (int i = 0; i < n; i++) {
                books_arr[i] = s.nextInt();
                max_pages += books_arr[i];
            }

            int start = books_arr[n-1]; // Book with max number of pages
            int end = max_pages; // cant go beyond maximum pages
            int ans = -1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (allocationSuccess(books_arr, mid, m)) {
                    ans = mid;
                    end = mid -1;

                } else {
                    start = mid +1;
                }
            }
            System.out.println("Answer is >> " + ans);
            no_of_test_cases--;
        }

    }

    public static boolean allocationSuccess(int[] books, int max_pages, int no_of_studs) {
        int curr_student = 1;
        int i = 0;
        int pages_assnd = 0;
        while (i < books.length) {
            pages_assnd += books[i];
            if (pages_assnd > max_pages) {
                pages_assnd = 0;
                curr_student++;

            } else {
                i++;
            }
            if (curr_student > no_of_studs) {
                return false;

            }

        }
        return true;

    }
}

