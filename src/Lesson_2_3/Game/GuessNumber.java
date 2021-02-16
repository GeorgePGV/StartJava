package Lesson_2_3.Game;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
           this.player1 = player1;
           this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in,"Cp866");
        System.out.println("Игра началась!");
        int randomNum = (int) (Math.random() * 101);
        System.out.println("Попробуйте угадать число, загаданное компьютером");
        while(true) {
            System.out.println(player1.getName() + " введите число");
            player1.setNum(scanner.nextInt());
            if (player1.getNum() > randomNum) {
                System.out.println("Загаданное число меньше");
            } else if(player1.getNum() < randomNum) {
                System.out.println("Загаданное число больше");
            } else if(player1.getNum() == randomNum) {
                System.out.println("Поздравляю, " + player1.getName() + " ты победил(а)!!!");
                break;
            }

            System.out.println(player2.getName() + " введите число");
            player2.setNum(scanner.nextInt());
            if (player2.getNum() > randomNum) {
                System.out.println("Загаданное число меньше");
            } else if(player2.getNum() < randomNum) {
                System.out.println("Загаданное число больше");
            } else if(player2.getNum() == randomNum) {
                System.out.println("Поздравляю, " + player2.getName() + " ты победил(а)!!!");
                break;
            }
        }
    }
}