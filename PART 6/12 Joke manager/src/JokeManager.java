
/**
 * @author SEB
 */

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;
    private Random random;

    public JokeManager() {
        this.jokes = new ArrayList<>();
        this.random = new Random();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            int index = random.nextInt(jokes.size());
            return this.jokes.get(index);
        }
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }

}
