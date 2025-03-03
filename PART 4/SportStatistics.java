/**
* @author SEB
*/

import java.util.Scanner;
// import java.util.ArrayList;
import java.nio.file.Paths;


public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scanner.nextLine();
        System.out.println("Team:");
        String teamToSearch = scanner.nextLine();


        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner scanFile = new Scanner(Paths.get(fileName))) {
            // ArrayList<String> dataTeam = new ArrayList<>();

            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                String[] parts = line.split(",");
                int result1 = Integer.valueOf(parts[2]);
                int result2 = Integer.valueOf(parts[3]);

                if (line.contains(teamToSearch)) {
                    games++;
                }

                if(parts[0].equals(teamToSearch) && result1 > result2){
                    wins++;
                } else if (parts[1].equals(teamToSearch) && result2 > result1){
                    wins++;
                } else if (parts[0].equals(teamToSearch) || parts[1].equals(teamToSearch)){
                    losses++;
                }
            }


        } catch (Exception e) {
            System.out.println("Reading the file: " + fileName + " failed.");
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

        scanner.close();
    }
}
