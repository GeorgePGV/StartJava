package Lesson_2_3_4.Calculator;

import java.util.Scanner;

public class CalculatorTest {
        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите математическое выражение");
            String expression = scanner.next();
            String [] mathExpressions = expression.split("",0);
            System.out.println(calculator.calculate(mathExpressions));
        }
}
