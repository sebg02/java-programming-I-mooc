
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a string: ");

        String userInput = scanner.nextLine();
        
        String message = userInput.equals("true") ? "You got it right!" : "Try again!";
        
        System.out.println(message);
              
        
        scanner.close();
    }
}
