package Lesson_2_3_4.Game;

public class Player2 {
    private final String name;
    private int num;
    private final int [] num2 = new int[10];
    private int attempt ;

    public Player2(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {

        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNum2(int num, int i) {
        num2[i] = num;
    }

    public int[] getNum2() {
        return num2;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}
