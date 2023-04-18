package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class GCD {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static final int RANDOM_START = 0;
    public static final int MAX_NUMBER = 30;

    public static void script() {

        String[][] data = new String[Engine.TOTAL_ROUNDS][2];
        for (int i = 0; i < Engine.TOTAL_ROUNDS; i++) {

            int rightAnswer;
            int number1 = Utils.getRandomNumber(RANDOM_START, MAX_NUMBER);
            int number2 = Utils.getRandomNumber(RANDOM_START, MAX_NUMBER);
            data[i][0] = number1 + " " + number2;
            data[i][1] = String.valueOf(gcdGame(number1, number2));
        }
        Engine.run(data, DESCRIPTION);
    }

    public static int gcdGame(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }
}

