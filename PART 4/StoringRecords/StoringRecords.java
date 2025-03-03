
/**
* @author SEB
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);
        }

        scan.close();
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> listOfPeople = new ArrayList<>();

        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                listOfPeople.add(new Person(name, age));
            }

        } catch (Exception e) {
            System.out.println("Reading the file: " + file + " failed.");
        }

        return listOfPeople;
    }
}