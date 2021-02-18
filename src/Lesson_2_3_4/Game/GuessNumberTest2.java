package Lesson_2_3_4.Game;

import java.util.Scanner;

public class GuessNumberTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"Cp866");
        String answer = "Yes";
        while(answer.equals("Yes")) {
            System.out.println("Enter the name of the first player");
            Player2 player1 = new Player2(scanner.next());
            System.out.println("Enter the name of the second player");
            Player2 player2 = new Player2(scanner.next());
            GuessNumber2 game = new GuessNumber2(player1, player2);
            game.start();
            do {
                System.out.println("Do you want to continue playing? [Yes/No]:");
                answer = scanner.next();
            }while(!answer.equals("Yes") && !answer.equals("No"));
        }
    }
}
