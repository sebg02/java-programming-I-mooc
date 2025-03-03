
/**
* @author SEB
*/

import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its content printed?");
        try (Scanner scanFile = new Scanner(Paths.get(scanner.nextLine()))) {
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();

    }
}
