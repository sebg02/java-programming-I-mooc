/**
 *  @author SEB
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> itemsList = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }

            Item newItem = new Item(identifier, name);
            if (itemsList.contains(newItem)) {
                continue;
            }

            itemsList.add(newItem);
        }

        System.out.println("==Items==");
        for (Item item : itemsList) {
            System.out.println(item);
        }

        scanner.close();

    }
}
