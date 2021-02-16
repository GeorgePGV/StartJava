package Lesson_2_3_4.Calculator;

public class Calculator {
    public double calculate(String[] mathExpressions) {
        double result = 0;
        int num1 = Integer.parseInt(mathExpressions[0]);
        int num2 = Integer.parseInt(mathExpressions[2]);
        switch(mathExpressions[1]) {
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "/" :
                result = num2 / (num1 * 1.0);
                break;
            case "^" :
                result = Math.pow(num1,num2);
                break;
            case "%" :
                result = num1 % num2;
                break;
            default :
                System.out.println("Некорректный ввод");
        }
        return result;
    }
}
