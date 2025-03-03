
/**
* @author SEB
*/

import java.util.Scanner;

public class CountOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        while (true) {
            String userImput = scanner.nextLine();
            if (userImput.equals("end")) {
                break;
            }
            counter++;

        }
        System.out.println(counter);

        scanner.close();
    }
}
