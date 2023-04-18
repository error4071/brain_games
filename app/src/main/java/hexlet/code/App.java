package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

class App {
    public static void main(String[] arguments) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        String number = scanner.nextLine();
        System.out.println();

        if (number.equals("1")) {
            Cli.userName();
        } else if (number.equals("2")) {
            EvenGame.script();
        } else if (number.equals("3")) {
            Calculator.script();
        } else if (number.equals("4")) {
            GCD.script();
        } else if (number.equals("5")) {
            Progression.script();
        } else if (number.equals("6")) {
            Prime.script();
        } else if (number.equals("0")) {
            System.exit(0);
        }
    }
}

