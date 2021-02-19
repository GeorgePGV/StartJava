package Lesson_2_3_4.Game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber2 {

        private final Player2 player1;
        private final Player2 player2;

        public GuessNumber2(Player2 player1, Player2 player2) {
            this.player1 = player1;
            this.player2 = player2;
        }

        public void start() {
            System.out.println("The game has begun!");
            int randomNum = (int) (Math.random() * 101);
            System.out.println("Try to guess the number guessed by the computer");
            System.out.println("You have 10 attempts");
            for (int i = 0; i < 10; i++) {
                input(i,player1);
                check(i,player1, randomNum);
                if (player1.getNumber(i) == randomNum) {
                    System.out.println(player1.getNumber(i) + " guessed the number " + player1.getNumber(i) + " on the " + (i + 1) + " attempt");
                    break;
                }
                input(i,player2);
                check(i,player2, randomNum);
                if (player2.getNumber(i) == randomNum) {
                    System.out.println(player2.getName() + " guessed the number " + player2.getNumber(i) + " on the " + (i + 1) + " attempt");
                    break;
                }
            }
            attemptsOutput(player1);
            attemptsOutput(player2);
            System.out.println();
            Arrays.fill(player1.getNumbers(), 0);
            Arrays.fill(player2.getNumbers(), 0);
        }

        public void input(int i, Player2 player1) {
            System.out.println(player1.getNumber(i) + " enter a number");
            Scanner scanner = new Scanner(System.in, "Cp866");
            player1.setNumbers(scanner.nextInt(), i);
            player1.setAttempt(i);
        }

        public void check(int i, Player2 player1, int randomNum) {
            if (player1.getNumber(i) > randomNum) {
                System.out.println("The hidden number is less");
                if (i == 9) {
                    System.out.println(player1.getNumber(i) + " has run out of attempts");
                }
            } else if (player1.getNumber(i) < randomNum) {
                System.out.println("The hidden number is greater");
                if (i == 9) {
                    System.out.println(player1.getNumber(i) + " has run out of attempts");
                }
            }
        }

        public void attemptsOutput(Player2 player1) {
            int[] num2copy1 = Arrays.copyOf(player1.getNumbers(), player1.getAttempt() + 1);
            System.out.println(player1.getName() + " attempts");
            for (int b : num2copy1) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
}