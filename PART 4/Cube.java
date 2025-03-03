
/**
* @author SEB
*/

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userImput = scanner.nextLine();

            if (userImput.equals("end")) {
                break;
            }

            int intUserImput = Integer.valueOf(userImput);
            int cubeUserImput = intUserImput * intUserImput * intUserImput;
            System.out.println(cubeUserImput);
        }

        scanner.close();
    }
}
