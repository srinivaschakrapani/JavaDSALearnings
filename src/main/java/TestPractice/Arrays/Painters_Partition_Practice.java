/*
Problem statement : https://www.geeksforgeeks.org/painters-partition-problem/
 */
package TestPractice.Arrays;

import java.util.Arrays;

public class Painters_Partition_Practice {
    public static void main(String[] args) {
        int no_of_painters = 2;
        int[] paint_jobs = {10, 20, 30, 40};
//        int[] paint_jobs = {10, 10, 10, 10};
        long max_paint_job_time = Arrays.stream(paint_jobs).sum();


        //min time to paint
        //Linear serach
//        for (int i = 1; i < max_paint_job_time; i++) {
//            var done = isPaintJobPossible(paint_jobs, no_of_painters, i);
//            System.out.println("Paint job can be done in ? " + i + " = " + done);
//
//        }
        //Binary search
        //find max
        long min_time_needed = Integer.MIN_VALUE;
        for (int i = 0; i < paint_jobs.length; i++) {
            if (min_time_needed < paint_jobs[i]) {
                min_time_needed = paint_jobs[i];
            }

        }
        long ans = 0;

        while (min_time_needed <= max_paint_job_time) {
            long mid = (max_paint_job_time + min_time_needed) / 2;
            if (isPaintJobPossible(paint_jobs, no_of_painters, mid)) {
                ans = mid;
                max_paint_job_time = mid - 1;
            } else {
                min_time_needed = mid + 1;
            }
        }
        System.out.println("Paint job can be done in ? = " + ans);
    }

    public static boolean isPaintJobPossible(int[] paint_jobs_timings, int no_of_painters, long max_time_for_each_painter) {
        //Is it possible to get the job done if we allocate max_time_for_each_painter
        int i = 0;
        int paint_job_time = 0;
        int painters_allocated_so_far = 1;
        while (i < paint_jobs_timings.length) {
            paint_job_time += paint_jobs_timings[i];
            if (paint_job_time > max_time_for_each_painter) {
                paint_job_time = 0;
                painters_allocated_so_far++;
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
