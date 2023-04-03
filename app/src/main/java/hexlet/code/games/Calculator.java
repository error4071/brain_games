package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final String DESCRIPTION = "What is the result of the expression?";
    public static final String[] OPERATORS = {"+", "-", "*"};
    public static final int MAX_NUMBER = 10;

    public static void script() {

        String[][] data = new String[Engine.TOTAL_ROUNDS][2];
        for (int i = 0; i < Engine.TOTAL_ROUNDS; i++) {

            int number1 = Utils.getRandomNumber(0, MAX_NUMBER);
            int number2 = Utils.getRandomNumber(0, MAX_NUMBER);
            String operator = OPERATORS[Utils.getRandomNumber(0, OPERATORS.length)];
            data[i][0] = number1 + " " + operator + " " + number2;
            data[i][1] = String.valueOf(calcGame(number1, number2, operator));
        }
        Engine.run(data, DESCRIPTION);
    }
    private static int calcGame(int number1, int number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }
}
