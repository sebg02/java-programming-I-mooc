
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String userImput = scanner.nextLine();
        int sumAges = 0;
        int count = 0;
        double averageAges = 1.0;
        String longestName = "";
        while (!userImput.equals("")) {
            String [] pieces = userImput.split(",");

            if (pieces[0].length() > longestName.length()) {
                longestName = pieces[0];
            }
            
            sumAges +=  Integer.valueOf(pieces[1]);
            count++;

            userImput = scanner.nextLine();
        }

        averageAges = (double) sumAges / count;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years " + averageAges);
        
        scanner.close();
    }
}
