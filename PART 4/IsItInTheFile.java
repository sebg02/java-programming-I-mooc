/**
* @author SEB
*/

import java.util.Scanner;
import java.nio.file.Paths;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        System.out.println("Search for:");
        String stringToLookFor = scanner.nextLine();

        try (Scanner scanFile = new Scanner(Paths.get(fileName))){
            boolean wasFound = false;
            while (scanFile.hasNextLine()) {
                String stringInFile = scanFile.nextLine();
                if (stringInFile.equals(stringToLookFor)) {
                    System.out.println("Found!");
                    wasFound = true;
                    break;
                }
            }
            if (!wasFound) {
                System.out.println("Not found.");
            }

        } catch (Exception e) {
            System.out.println("Reading the file: " + fileName + " failed." );
        }

        scanner.close();
    }
}
