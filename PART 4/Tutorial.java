
/**
* @author SEB
*/

import java.util.ArrayList;
import java.util.Scanner;
// import java.util.Random;

public class Tutorial {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, year));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String info = scanner.nextLine();

        if (info.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (info.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

        scanner.close();
    }

}
