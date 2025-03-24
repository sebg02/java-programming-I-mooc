
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String userImput = scanner.nextLine();
        while (!userImput.equals("")) {
            String [] pieces = userImput.split(" ");
            System.out.println(pieces[0]);
            userImput = scanner.nextLine();
        }
        
        
        scanner.close();

    }
}
