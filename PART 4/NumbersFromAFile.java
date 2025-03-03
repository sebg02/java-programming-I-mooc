
/**
* @author SEB
*/

import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String fileName = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int counter = 0;
        try (Scanner scanFile = new Scanner(Paths.get(fileName))) {
            while (scanFile.hasNextLine()) {
                int currentNumber = Integer.valueOf(scanFile.nextLine());
                if (currentNumber >= lowerBound && currentNumber <= upperBound) {
                    counter++;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Numbers: " + counter);
        scanner.close();
    }
}
