/* Painter's Partition Problem

Constraints
1 <= K <= 10
1 <= N <= 10
1<= Length of each Board <= 10^8


Output Format
Output the minimum time required to paint the board.


Sample Input
2
2
1 10
Sample Output
10

Sample I/O:
3
5
5 10 30 20 15
35 --> Output
*/
package CJPractice.Arrays.Faang;

import java.util.Scanner;

public class PaintersPartitionProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no_boards = s.nextInt();

        int no_of_painters = s.nextInt();
//        int no_boards = s.nextInt();
        int[] paint_jobs_arr = new int[no_boards];
        for (int i = 0; i < no_boards; i++) {
            paint_jobs_arr[i] = s.nextInt();
        }
        //total max time to paint all the boards provided
        int max_paint_job_time = 0;
        for (int x : paint_jobs_arr) {
            max_paint_job_time += x;
        }

        //Get the max time from the paint_jobs_array
        int max_ele = Integer.MIN_VALUE;
        for (int x : paint_jobs_arr) {
            if (max_ele < x) {
                max_ele = x;
            }

        }

        int start = max_ele;
        int end = max_paint_job_time;

        int min_time_paint_job = 0;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
//            System.out.println(mid);
            boolean isPaintJobPossibleWithMid = isAllocationPossible(paint_jobs_arr, mid, no_of_painters);

            if (isPaintJobPossibleWithMid) {
                //Paint job is possible with mid , since we have to find minimum time search on right side of mid
                min_time_paint_job = mid;
                end = mid - 1;
            } else {
                //Paint job is not possible with mid , since we have to find first possible value
                // search on left side of mid
                start = mid + 1;
            }

        }
        System.out.println(min_time_paint_job);
    }

    public static boolean isAllocationPossible(int[] paint_jobs_timings, int max_load_per_painter, int no_of_painters) {
        // is it possible to get the paint job done by keeping max job time to "max_load_per_painter"
        // and also allocate to all the painters : no_of_painters
        int painters_allocated_so_far = 1;
        int workload = 0;
        int i = 0;
        while (i < paint_jobs_timings.length) {
            workload = workload + paint_jobs_timings[i];
            if (workload > max_load_per_painter) {
                painters_allocated_so_far = painters_allocated_so_far + 1;
                workload = 0;

            } else {
                i++;
            }

            if (painters_allocated_so_far > no_of_painters) {
                return false;
            }
        }
        return true;
    }

}
