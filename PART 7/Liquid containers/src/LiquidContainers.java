/**
 * @author SEB
 */

import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            System.out.print("> ");
            
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                if (first + amount > 100) {
                    first = 100;
                } else if (amount < 0) {
                    continue;
                } else {
                    first += amount;
                }
            } else if(command.equals("move")) {
                if (amount > first) {
                    second = second + first;
                    first = 0;
                } else if (amount < 0) {
                    continue;
                } else if (first + second > 100) {
                    second = 100;
                    first = first - amount; 
                } else {
                    second = second + amount;
                    first = first - amount;
                }
            } else if(command.equals("remove")) {
                if (amount > second) {
                    second = 0;
                } else {
                    second = second - amount;
                }
            }
        } 
        scanner.close();
    }
}
