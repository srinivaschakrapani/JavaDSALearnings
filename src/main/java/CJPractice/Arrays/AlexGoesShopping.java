package CJPractice.Arrays;


import java.util.Scanner;

public class AlexGoesShopping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int no_of_items = s.nextInt();
//        int no_of_items = 4;

//        int[] price_of_items = {100, 200, 400, 100};
        int[] price_of_items = new int[no_of_items];
        for (int i = 0; i < price_of_items.length; i++) {
            price_of_items[i] = s.nextInt();
        }
//        Arrays.sort(price_of_items);

        int no_of_queries = s.nextInt();
        while (no_of_queries > 0) {
//            int total_amt = 500;
//            int purchasing_power = 4;
            int total_amt = s.nextInt();
            int purchasing_power = s.nextInt();
            shopkeeperClaim(price_of_items, total_amt, purchasing_power);
            no_of_queries--;
        }

    }

    public static void shopkeeperClaim(int[] prices, int total_amt, int pp) {
        int can_buy_types = 0;
        for (int x : prices) {
            if (total_amt % x == 0) {
                can_buy_types++;
            }
        }
        if (can_buy_types == pp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
