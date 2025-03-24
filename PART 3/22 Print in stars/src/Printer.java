
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int i : array) {
            printStars(i);
        }
    }

    public static void printStars(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
