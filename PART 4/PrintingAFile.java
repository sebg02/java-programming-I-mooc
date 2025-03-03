
/**
* @author SEB
*/

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {
    public static void main(String[] args) {

        // No se debe abrir el scanner antes
        try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Cerrar el escaner no sirve de nada porque el scanner se cierra en el
        // bloque try catch
        // scanner.close();
    }
}
