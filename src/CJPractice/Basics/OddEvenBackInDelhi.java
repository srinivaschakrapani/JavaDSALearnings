package CJPractice.Basics;

import java.util.Scanner;

public class OddEvenBackInDelhi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num_test_cases = s.nextInt();

        while (num_test_cases > 0) {
            int car_number = s.nextInt();
            int sum_of_digits_even = 0;
            int sum_of_digits_odd = 0;

            if (car_number == 0) {
                System.out.println("Yes");
            } else {

                while (car_number > 0) {
                    int last_digit = (car_number % 10);
                    if (last_digit % 2 == 0) {
                        sum_of_digits_even = sum_of_digits_even + last_digit;
                    } else {
                        sum_of_digits_odd = sum_of_digits_odd + last_digit;
                    }
                    car_number = car_number / 10;
                }
                if ((sum_of_digits_even % 4 == 0) || (sum_of_digits_odd % 3 == 0)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            num_test_cases = num_test_cases - 1;
        }
    }
}
