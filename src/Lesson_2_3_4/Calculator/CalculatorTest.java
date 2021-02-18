package Lesson_2_3_4.Calculator;

import java.util.Scanner;

public class CalculatorTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String answer = "Да";
            while(answer.equals("Да")) {
                Calculator calculator = new Calculator();
                System.out.println("Введите математическое выражение, отделив элементы от знака пробелом");
                String expression = scanner.nextLine();
                String[] mathExpressions = expression.split(" ", 3);
                System.out.println(calculator.calculate(mathExpressions));
                do {
                    System.out.println("Хотите продолжить игру? [Да/Нет]:");
                    answer = scanner.nextLine();
                } while(!answer.equals("Да") && !answer.equals("Нет"));
            }
        }
}
