
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String userImput = scanner.nextLine();
        while (!userImput.equals("")) {
            String [] pieces = userImput.split(" ");
            System.out.println(pieces[pieces.length - 1]);
            userImput = scanner.nextLine();
        }
        
        
        scanner.close();
    }
}
