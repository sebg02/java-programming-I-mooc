
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int number1 = Integer.valueOf(scanner.nextLine());
            
            if (number1 == 0){
                break;
            }
            
            if (number1 < 0) {
                count++;
            }
            
        }
        System.out.println("Number of negative numbers: " + count);
        
        
        scanner.close();
    }
}
