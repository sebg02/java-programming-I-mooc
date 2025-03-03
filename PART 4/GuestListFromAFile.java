
/**
* @author SEB
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class GuestListFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guestList = new ArrayList<>();

        System.out.println("Name of the file: ");
        try (Scanner scanFile = new Scanner(Paths.get(scanner.nextLine()))) {
            while (scanFile.hasNextLine()) {
                String name = scanFile.nextLine();
                guestList.add(name);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String enteredName = scanner.nextLine();
            if (enteredName.isEmpty()) {
                break;
            }

            if (guestList.contains(enteredName)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thank you!");

        scanner.close();
    }

}
