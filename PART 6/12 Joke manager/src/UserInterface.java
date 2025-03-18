
/**
 * @author SEB
 */

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager jokeM;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeM = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("What a joke!");

        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                String joke = scanner.nextLine();
                jokeM.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(jokeM.drawJoke());
            } else if (command.equals("3")) {
                jokeM.printJokes();
            }
        }
    }
}
