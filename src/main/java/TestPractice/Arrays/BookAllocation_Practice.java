/*
Problem statement :
https://www.geeksforgeeks.org/allocate-minimum-number-pages/
 */
package TestPractice.Arrays;

import java.util.Arrays;

public class BookAllocation_Practice {
    public static void main(String[] args) {
        int no_of_students = 2;
        int boo_page_count[] = {12, 34, 67, 90};
        int total_pages_cnt = Arrays.stream(boo_page_count).sum();
        //Using Linear search from 1 to max number of Pages
        /*
        for (int i = 1; i <= total_pages_cnt; i++) {
            var x = isPossible(boo_page_count, no_of_students, i);
            if (x) {
                System.out.println("Max Pages Allocation possible ? " + i + " >> " + x);
                break;
            }
        }*/
        //Using Binary search
        //what is the minimum value ?
        //what is the max value ?
        int min_pages_to_allocate = boo_page_count[boo_page_count.length - 1];
        int start_page_count = min_pages_to_allocate;
        int max_pages_can_be_allocated = total_pages_cnt;
        int ans = -1;
        while(start_page_count <= max_pages_can_be_allocated){
            int mid = (start_page_count + max_pages_can_be_allocated) / 2;
            if(isPossible(boo_page_count, no_of_students, mid))
            {
                ans = mid;
                max_pages_can_be_allocated = mid-1;
            }
            else{
                start_page_count = mid+1;
            }
        }
        System.out.println("Max Pages Allocation possible ? " + start_page_count + " >> " + ans);




    }

    public static boolean isPossible(int[] pages, int no_of_studs, int max_pages) {
        //is it possible to allocate max_pages of consecutive books to a student ?
        int pages_allocated_so_far = 0;
        int student_allocated_so_far = 1;
        int i = 0;
        while (i < pages.length) {
            pages_allocated_so_far += pages[i];
            if (pages_allocated_so_far > max_pages) {
                student_allocated_so_far++;
                pages_allocated_so_far = 0;

            } else {
                i++;
            }
            if (student_allocated_so_far > no_of_studs) {
                return false;
            }
        }

        return true;


    }
}
