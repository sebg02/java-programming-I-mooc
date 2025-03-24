
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String userImput = scanner.nextLine();
        int ageOldest = 0;
        while (!userImput.equals("")) {
            String [] pieces = userImput.split(",");
            int intValue = Integer.valueOf(pieces[1]);
            if (intValue > ageOldest){
                ageOldest = intValue;
            }
            userImput = scanner.nextLine();
        }
        
        System.out.println("Age of oldest: " + ageOldest);
        
        scanner.close();
    }
}
