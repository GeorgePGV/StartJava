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

    public void setNumber(int number) {
        numbers[attempt] = number;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt + 1);
    }

    public int getNumber() {
        return numbers[attempt];
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void cleanArray() {
        Arrays.fill(numbers, 0);
    }
}
