package Lesson_2_3_4.Game;

import java.util.Arrays;

public class Player2 {
    private final String name;
    private final int[] numbers = new int[10];
    private int attempt;

    public Player2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int i) {
        numbers[i] = number;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, 10);
    }

    public int getNumber(int i) {
        return numbers[i];
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}
