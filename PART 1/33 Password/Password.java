
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Password?");
        String userPasswordInput = scan.nextLine();
        
        if (userPasswordInput.equals("Caput Draconis ")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
        
        scan.close();
    }
}
