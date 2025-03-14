
/**
 *  @author SEB
 */

import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> listSuitcases;

    public Hold(int maxWeight) {
        this.maximumWeight = maxWeight;
        this.listSuitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!(this.totalWeight() + suitcase.totalWeight() > maximumWeight)) {
            this.listSuitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : listSuitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    public void printItems() {
        for (Suitcase stc : this.listSuitcases) {
            stc.printItems();
        }
    }

    @Override
    public String toString() {
        return String.format("%d suitcases (%d kg)",
                this.listSuitcases.size(), this.totalWeight());
    }

}
