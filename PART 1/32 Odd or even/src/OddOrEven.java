
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int myNum = Integer.valueOf(scan.nextLine());
        
        if (myNum % 2 == 0) {
            System.out.println("Number " + myNum + " is even.");
        } else {
            System.out.println("Number " + myNum + " is odd.");
        }
        
        scan.close();
    }
}
