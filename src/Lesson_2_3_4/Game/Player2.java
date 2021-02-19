package Lesson_2_3_4.Game;

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

    public void setNumbers(int num, int i) {
        numbers[i] = num;
    }

    public int[] getNumbers() {
        return numbers;
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
