
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-5);
        list.add(0);
        list.add(3);
        list.add(4);
        list.add(20);
        
        int low = -5;
        int high = 25;
        System.out.println("The numbers in the range: " + "[" + low + "," + high + "]");
        printNumbersInRange(list, low, high);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int item: numbers) {
            if (item >= lowerLimit && item <= upperLimit) {
                System.out.println(item);
            }
        }
    }
    
}
