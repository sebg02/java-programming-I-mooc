
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String userImput = scanner.nextLine();
            if (userImput.length()== 0) {
                break;
            }
            String[] pieces = userImput.split(" ");
            for (String word:pieces) {
                System.out.println(word);
            }
            
        }
        
        scanner.close();
    }
}
