
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String userImput = scanner.nextLine();
        while (!userImput.equals("")) {
            String [] pieces = userImput.split(" ");
            for (String string : pieces) {
                if (string.contains("av")) {
                    System.out.println(string);
                }
            }
            userImput = scanner.nextLine();
        }
        
        
        scanner.close();
    }
}
