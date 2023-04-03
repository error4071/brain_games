package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MAX_NUMBER = 10;

    public static void script() {

        String[][] data = new String[Engine.TOTAL_ROUNDS][2];
        for (int i = 0; i < Engine.TOTAL_ROUNDS; i++) {

            int number1 = Utils.getRandomNumber(0, MAX_NUMBER);
            data[i][0] = String.valueOf(number1);
            data[i][1] = isPrime(number1) ? "yes" : "no";
        }
        Engine.run(data, DESCRIPTION);
    }

    private static boolean isPrime(int number1) {

        if (number1 < 2) {
            return false;
        }
        for (int k = 2; k <= Math.sqrt(number1); k += 1) {
            if (number1 % k == 0) {
                return false;
            }
        }
        return true;
    }
}




