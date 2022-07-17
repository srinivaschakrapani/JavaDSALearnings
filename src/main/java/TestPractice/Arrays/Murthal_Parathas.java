package TestPractice.Arrays;

public class Murthal_Parathas {
    public static void main(String[] args) {
        int N = 4;
        int[] parathas = {1, 2, 3, 4};
        int P = 10;
        int min_time = 1;
        int max_time = Integer.MAX_VALUE;

//        //Linear Search
//        for (int i = 1; i < 50; i++) {
//            var x = isPossible(parathas, P, i);
//            System.out.println("Parathas can be cooked ? " + P + " time >> " + i + " >> " + x);
//
//        }
        //Binary Search
        int ans = Integer.MIN_VALUE;
        while (min_time <= max_time) {
            int mid = (min_time + max_time) / 2;
            if (isPossible(parathas, P, mid)) {
                if (ans < mid) {
                    System.out.println("Parathas can be " + P + " can be cooked ? in " + mid + " time !!");
                }
                max_time = mid - 1;
            } else {
                min_time = mid + 1;
            }
        }

    }

    public static boolean isPossible(int[] ranks, int parathas, int max_time_to_cook) {
        int i = 0;
        int parathas_count = 0;
        while (i < ranks.length) {
            int j = 1;
            int time_takes = 0;
            while ((time_takes + (ranks[i] * j)) <= max_time_to_cook) {
                time_takes = time_takes + (ranks[i] * j);
                j++;
                parathas_count++;

                if (parathas_count == parathas) {
                    return true;
                }
            }
            i++;
        }
        return false;

    }
}
