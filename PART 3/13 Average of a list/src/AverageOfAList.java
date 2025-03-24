
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true) {
            int numEntered = Integer.valueOf(scanner.nextLine());
            if (numEntered == -1){
                break;
            }
            numbers.add(numEntered);
        }
        
        int sum = 0;
        for (int num:numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.size();
        System.out.println("Average: " + average);
        
        
        scanner.close();
    }
}
