
/**
 * @author SEB
 */

import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            } else if (command.equals("move")) {
                if (amount < 0) {
                    continue;
                }

                if (amount > first.contains()) {
                    second.add(first.contains());
                    first.remove(first.contains());
                } else {
                    second.add(amount);
                    first.remove(amount);
                }
            }
        }

        scanner.close();
    }
}
