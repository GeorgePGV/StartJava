package Lesson_2_3_4.Game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber2 {

    private final Player2 player1;
    private final Player2 player2;

    public GuessNumber2(Player2 player, Player2 player2) {
        this.player1 = player;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("The game has begun!");
        int randomNum = (int) (Math.random() * 101);
        System.out.println("Try to guess the number guessed by the computer");
        System.out.println("You have 10 attempts");
        for (int i = 0; i < 10; i++) {
            inputNumber(i,player1);
            if (checkNumber(player1, randomNum)) {
                break;
            }
            inputNumber(i, player2);
            if (checkNumber(player2,randomNum)) {
                break;
            }
        }
        outputAttempts(player1);
        outputAttempts(player2);
        System.out.println();
        player1.cleanArray();
        player2.cleanArray();
    }

    private void inputNumber(int i, Player2 player) {
        System.out.println(player.getName() + " enter a number");
        Scanner scanner = new Scanner(System.in, "Cp866");
        player.setAttempt(i);
        player.setNumber(scanner.nextInt());
    }

    private boolean checkNumber(Player2 player, int randomNum) {
        boolean result = false;
        int number = player.getNumber();
        String answer = (number > randomNum) ? "The hidden number is less" : "The hidden number is greater";
        System.out.println(answer);
        if (number == randomNum) {
            System.out.println(player.getName() + " guessed the number " + number + " on the " + (player.getAttempt() + 1) + " attempt");
            result = true;
        }
        if (player.getAttempt() == 9) {
            System.out.println(player.getName() + " has run out of attempts");
        }
        return result;
    }

    private void outputAttempts(Player2 player) {
        System.out.println(player.getName() + " attempts");
        for (int attempt : player.getNumbers()) {
            System.out.print(attempt + " ");
        }
        System.out.println();
    }
}