package CJPractice.Recursion.Classroom;

public class EnglishRuler {
    public static void main(String[] args) {
        englishRuler(3,4);

    }

    public static void englishRuler(int ruler_length, int length_major_tick){
        if (length_major_tick == 0) {
            return;

        }
        for (int i = 0; i < length_major_tick; i++) {
            System.out.print("-");

        }
        System.out.println(ruler_length);
        englishRuler(ruler_length-1, length_major_tick -1);
        for (int i = 0; i < length_major_tick; i++) {
            System.out.print("-");

        }
        System.out.println();
        englishRuler(ruler_length-1, length_major_tick -1);

    }

}
