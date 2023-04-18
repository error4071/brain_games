package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int TOTAL_ROUNDS = 3;

    public static void run(String[][] dataBase, String description) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(description);

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            String question = dataBase[i][0];
            String answer = dataBase[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String myAnswer = scanner.nextLine();

            if (myAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else if (!myAnswer.equals(answer)) {
                System.out.println("'" + myAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + answer + "'" + ".\n" + "Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

