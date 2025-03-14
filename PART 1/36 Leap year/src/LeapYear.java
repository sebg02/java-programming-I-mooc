
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());
        String leapMessage = "The year is a leap year";
        String notLeapMessage = "The year is not a leap year";

        
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(leapMessage);
            } else {
                System.out.println(notLeapMessage);
            }
        } else if (year % 4 == 0) {
            System.out.println(leapMessage);
        } else {
            System.out.println(notLeapMessage);
        }
        
        
        scan.close();

    }
}
