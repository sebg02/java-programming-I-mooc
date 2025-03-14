
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine()) ;
        int taxLowerLimit;
        double tax, taxRate;
        
        
        if (giftValue >= 1000000) {
            taxRate = 0.17;
            taxLowerLimit = 142100;
            tax = (taxLowerLimit + (giftValue - 1000000) * taxRate);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            taxRate = 0.15;
            taxLowerLimit = 22100;
            tax = (taxLowerLimit + (giftValue - 200000) * taxRate);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 55000 && giftValue < 200000) {
            taxRate = 0.12;
            taxLowerLimit = 4700;
            tax = (taxLowerLimit + (giftValue - 55000) * taxRate);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 25000 && giftValue < 55000) {
            taxRate = 0.1;
            taxLowerLimit = 1700;
            tax = (taxLowerLimit + (giftValue - 25000) * taxRate);
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 5000 && giftValue < 25000) {
            taxRate = 0.08;
            taxLowerLimit = 100;
            tax = (taxLowerLimit + (giftValue - 5000) * taxRate);
            System.out.println("Tax: " + tax);
        } else if (giftValue < 5000) {
            System.out.println("No tax!");
        }
        
         
        
        
        
        scan.close();
    }
}
