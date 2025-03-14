
/**
 * @author SEB
 */

import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> listItems;

    public Suitcase(int maxWeight) {
        this.maximumWeight = maxWeight;
        this.listItems = new ArrayList<>();
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : listItems) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Item item : listItems) {
            System.out.println(item);
        }
    }

    public void addItem(Item item) {
        if (!(totalWeight() + item.getWeight() > maximumWeight)) {
            this.listItems.add(item);
        }
    }

    public Item heaviestItem() {
        if (this.listItems.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.listItems.get(0);
        for (Item item:this.listItems) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }

    @Override
    public String toString() {
        if (totalWeight() == 0) {
            return "no items (0 kg)";
        }

        if (this.listItems.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }

        return this.listItems.size() + " items (" + this.totalWeight() + " kg)";
    }
}
