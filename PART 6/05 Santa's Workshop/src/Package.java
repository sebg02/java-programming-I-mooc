
/**
 *  @author SEB
 */

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> listGifts;

    public Package() {
        this.listGifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        listGifts.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Gift gift : listGifts) {
            totalWeight += gift.getWeight();
        }

        return totalWeight;
    }
}
