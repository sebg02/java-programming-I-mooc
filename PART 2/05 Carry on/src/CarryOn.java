import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numUser = 0;
        while(numUser != 4) {
            System.out.println("Give a number:");
            numUser = Integer.valueOf(scanner.nextLine());
        }
        
        
        scanner.close();

    }
}
