package Lesson_1;

public class Cycle {
    public static void main(String[] atgs) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int a = 6;
        while (a >= -6) {
            System.out.println(a);
            a -= 2;
        }

        int sum = 0;
        int c = 10;
        do {
            if (c % 2 == 1) {
                sum += c;
            }
            c++;
        } while (c <= 20);
        System.out.println(sum);
    }
}
