
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user = scanner.nextLine();
        String password = scanner.nextLine();
        
        if (user.equals("alex") && password.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (user.equals("emma") && password.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        
        
        scanner.close();
    }
}
