package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MAX_NUMBER = 10;

    public static void script() {

        String[][] data = new String[Engine.TOTAL_ROUNDS][2];
        for (int i = 0; i < Engine.TOTAL_ROUNDS; i++) {

            int number1 = Utils.getRandomNumber(0, MAX_NUMBER);
            data[i][0] = String.valueOf(number1);
            data[i][1] = isEven(number1) ? "yes" : "no";
        }
        Engine.run(data, DESCRIPTION);
    }
    private static boolean isEven(int number1) {

        return number1 % 2 == 0;
    }
}

