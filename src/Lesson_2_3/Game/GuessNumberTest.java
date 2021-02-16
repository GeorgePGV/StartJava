package Lesson_2_3.Game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"Cp866");
        String answer = "Да";
        while(answer.equals("Да")) {
            System.out.println("Введите имя первого игрока");
            Player player1 = new Player(scanner.nextLine());
            System.out.println("Введите имя второго игрока");
            Player player2 = new Player(scanner.nextLine());
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [Да/Нет]:");
                answer = scanner.nextLine();
            }while(!answer.equals("Да") && !answer.equals("Нет"));
        }
    }
}
