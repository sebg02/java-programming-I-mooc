
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int number1 = Integer.valueOf(scanner.nextLine());
            
            if (number1 == 0){
                break;
            }
            count++;
            
        }
        System.out.println("Number of numbers: " + count);
        
        
        scanner.close();
    }
}
