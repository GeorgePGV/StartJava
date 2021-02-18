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
            Scanner scanner = new Scanner(System.in, "Cp866");
            System.out.println("The game has begun!");
            int randomNum = (int) (Math.random() * 101);
            System.out.println("Try to guess the number guessed by the computer");
            System.out.println("You have 10 attempts");
            for (int i = 0; i < 10; i++) {
                System.out.println(player1.getName() + " enter a number");
                player1.setNum(scanner.nextInt());
                player1.setNum2(player1.getNum(), i);
                player1.setAttempt(i);
                if (player1.getNum() > randomNum) {
                    System.out.println("The hidden number is less");
                    if (i == 9) {
                        System.out.println(player1.getName() + " has run out of attempts");
                    }
                } else if (player1.getNum() < randomNum) {
                    System.out.println("The hidden number is greater");
                    if (i == 9) {
                        System.out.println(player1.getName() + " has run out of attempts");
                    }
                } else if (player1.getNum() == randomNum) {
                    System.out.println(player1.getName() + " guessed the number " + player1.getNum() + " on the " + (i + 1) + " attempt");
                    break;
                }

                System.out.println(player2.getName() + " enter a number");
                player2.setNum(scanner.nextInt());
                player2.setNum2(player2.getNum(), i);
                player2.setAttempt(i);
                if (player2.getNum() > randomNum) {
                    System.out.println("The hidden number is less");
                    if (i == 9) {
                        System.out.println(player1.getName() + " has run out of attempts");
                    }
                } else if (player2.getNum() < randomNum) {
                    System.out.println("The hidden number is greater");
                    if (i == 9) {
                        System.out.println(player1.getName() + " has run out of attempts");
                    }
                } else if (player2.getNum() == randomNum) {
                    System.out.println(player2.getName() + " guessed the number " + player2.getNum() + " on the " + (i + 1) + " attempt");
                    break;
                }
            }
            int[] num2copy1 = Arrays.copyOf(player1.getNum2(), player1.getAttempt() + 1);
            System.out.println(player1.getName() + " attempts");
            for (int b : num2copy1) {
                System.out.print(b + " ");
            }
            System.out.println();
            int[] num2copy2 = Arrays.copyOf(player2.getNum2(), player2.getAttempt() + 1);
            System.out.println(player2.getName() + " attempts");
            for (int c : num2copy2) {
                System.out.print(c + " ");
            }
            System.out.println();
            Arrays.fill(player1.getNum2(), 0);
            Arrays.fill(player2.getNum2(), 0);
        }
}