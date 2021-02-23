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
                inputNumber(i,player1);
                if (checkNumber(i,player1,randomNum)) {
                    break;
                }

                inputNumber(i,player2);
                if (checkNumber(i,player2,randomNum)) {
                    break;
                }
            }
            outputAttempts(player1);
            outputAttempts(player2);
            System.out.println();
            Arrays.fill(player1.getNumbers(), 0);
            Arrays.fill(player2.getNumbers(), 0);
        }

        private void inputNumber(int i, Player2 player) {
            System.out.println(player.getName() + " enter a number");
            Scanner scanner = new Scanner(System.in, "Cp866");
            player.setNumber(scanner.nextInt(), i);
            player.setAttempt(i);
        }

        private boolean checkNumber(int i, Player2 player, int randomNum) {
            boolean result = false;
            if (player.getNumber(i) > randomNum) {
                System.out.println("The hidden number is less");
                if (i == 9) {
                    System.out.println(player.getNumber(i) + " has run out of attempts");
                }
            } else if (player.getNumber(i) < randomNum) {
                System.out.println("The hidden number is greater");
                if (i == 9) {
                    System.out.println(player.getNumber(i) + " has run out of attempts");
                }
            } else if (player.getNumber(i) == randomNum) {
                System.out.println(player.getNumber(i) + " guessed the number " + player.getNumber(i) + " on the " + (i + 1) + " attempt");
                result = true;
            }
            return result;
        }

        private void outputAttempts(Player2 player1) {
            int[] numbers = Arrays.copyOf(player1.getNumbers(), player1.getAttempt() + 1);
            System.out.println(player1.getName() + " attempts");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
}