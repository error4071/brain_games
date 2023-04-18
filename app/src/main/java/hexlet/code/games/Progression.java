package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    public static final int PROGRESSION_LENGTH = 10;
    public static final int MAX_NUMBER = 100;
    public static final int MAX_STEP = 50;

    public static void script() {

        String[][] data = new String[Engine.TOTAL_ROUNDS][2];
        for (int i = 0; i < Engine.TOTAL_ROUNDS; i++) {

            int startNumber = Utils.getRandomNumber(1, MAX_NUMBER);
            int step = Utils.getRandomNumber(2, MAX_STEP);

            int hiddenMemberIndex = Utils.getRandomNumber(0, PROGRESSION_LENGTH);
            String[] progression = makeProgression(startNumber, step, PROGRESSION_LENGTH);
            data[i][1] = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            data[i][0] = String.join(" ", progression);
        }
        Engine.run(data, DESCRIPTION);
    }

    public static String[] makeProgression(int number2, int step2, int progression2) {

        String[] progression = new String[progression2];
        for (int k = 0; k < progression2; k++) {
            progression[k] = Integer.toString(number2 + k * step2);
        }
        return progression;
    }
}
