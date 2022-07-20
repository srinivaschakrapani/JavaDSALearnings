/*
Output >>>
---0
-
--
-
---1
-
--
-
---2
-
--
-
---3
-
--
-
---4
 */
package CJPractice.Recursion.mini_proj;

public class EnglishRuler {
    public static void main(String[] args) {
        englishRuler(4,3);

    }

    public static void pattern(int length_major_tick){
        if(length_major_tick == 0){
            return;
        }

        pattern(length_major_tick - 1);
        for (int i = 0; i < length_major_tick; i++) {
            System.out.print("-");
        }
        System.out.println();
        pattern(length_major_tick - 1);


    }

    public static void englishRuler(int ruler_length, int length_major_tick) {
        for (int i = 0; i < ruler_length; i++) {
            for (int j = 0; j < length_major_tick; j++) {
                System.out.print("-");
            }
            System.out.println(i);
            pattern(length_major_tick -1);
        }
        for (int j = 0; j < length_major_tick; j++) {
            System.out.print("-");
        }
        System.out.println(ruler_length);



    }
}
