
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 9999) {
                break;
            }
            
            numbers.add(num);
        }
        
        // Find smallest value
        int smallest = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int currentValue = numbers.get(i);
            if (currentValue < smallest) {
                smallest = currentValue;
            }
        }
        System.out.println("Smallest number: "+ smallest);
        
        // Print index(es) of smallest value
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) == smallest) {
                System.out.println("Found at index: " + j);
            }
        }
        scanner.close();
    }
}
