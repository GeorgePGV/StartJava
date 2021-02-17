package Lesson_2_3_4.Calculator;

public class Calculator {
    public double calculate(String[] mathExpressions) {
        int num1 = Integer.parseInt(mathExpressions[0]);
        int num2 = Integer.parseInt(mathExpressions[2]);
        switch(mathExpressions[1]) {
            case "+" :
                return num1 + num2;
            case "-" :
                return num1 - num2;
            case "*" :
                return num1 * num2;
            case "/" :
                return num1 / (num2 * 1.0);
            case "^" :
                return Math.pow(num1,num2);
            case "%" :
                return num1 % num2;
            default :
                System.out.println("Некорректный ввод");
        }
        return 0;
    }
}
