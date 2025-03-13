/**
 * @author SEB
 */

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> listStrings;

    public Stack() {
        this.listStrings = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.listStrings.isEmpty();
    }

    public void add(String value) {
        this.listStrings.add(value);
    }

    public String take() {
        int indexLast = this.listStrings.size() - 1;
        String lastItem = this.listStrings.get(indexLast);
        this.listStrings.remove(lastItem); 
        return lastItem;
    }

    public ArrayList<String> values() {
        return this.listStrings;
    }


}
