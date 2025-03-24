
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String userImput = scanner.nextLine();
        int ageOldest = 0;
        String nameOldest = "";
        while (!userImput.equals("")) {
            String [] pieces = userImput.split(",");
            int intValue = Integer.valueOf(pieces[1]);
            if (intValue > ageOldest){
                ageOldest = intValue;
                nameOldest = pieces[0];
            }
            userImput = scanner.nextLine();
        }
        
        System.out.println("Name of the oldest: " + nameOldest);
        
        scanner.close();
    }
}
