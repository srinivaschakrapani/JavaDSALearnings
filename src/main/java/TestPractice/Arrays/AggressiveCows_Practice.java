package TestPractice.Arrays;

import java.util.Arrays;

public class AggressiveCows_Practice {
    public static void main(String[] args) {
        int total_stalls = 5;
        int total_cows = 3;
        int[] barn_locs = {1, 2, 8, 4, 9};
        Arrays.sort(barn_locs);

        int max_loc = 0;
        for (int val : barn_locs) {
            if (max_loc < val) {
                max_loc = val;
            }
        }
        int max_dist = max_loc - 1;
        //Linear Search
        for (int i = 1; i <= max_dist; i++) {
            var isposs = isPlacementPossible(barn_locs, i, total_cows);
            System.out.println("Cows can be placed at a min distance of " + i + " >>" + isposs);
        }

        //Binary search
        int start = barn_locs[0];
        int end = barn_locs[barn_locs.length-1] - start;
        int ans = Integer.MIN_VALUE;
        while(start <= end){
            int mid = (start + end) / 2;
            if(isPlacementPossible(barn_locs, mid, total_cows)){
                if(ans < mid){
                    ans = mid;
                }
                start = mid+1;
            }
            else{
                end = mid - 1;

            }

        }
        System.out.println(ans);
    }

    public static boolean isPlacementPossible(int[] barn_locs, int min_distance, int total_cows) {
        int recent_cow_loc = barn_locs[0];
        int i = 1;
        int distance_between_cows = 0;
        int cows_placed_so_far = 1;
        while (i < barn_locs.length) {
            distance_between_cows = (barn_locs[i] - recent_cow_loc);
            if (distance_between_cows >= min_distance) {
                recent_cow_loc = barn_locs[i];
                cows_placed_so_far++;
                distance_between_cows = 0;
            } else {
                i++;
            }
        }
        if(cows_placed_so_far == total_cows){
            return true;
        }
        return false;

    }
}
