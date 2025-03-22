/**
 * @author SEB
 */

public class Container {
    private int value;

    public Container() {
        this.value = 0;
    }

    public int contains() {
        return this.value;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        if (amount + this.value > 100) {
            this.value = 100;
        } else {
            this.value += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        if (this.value - amount < 0) {
            this.value = 0;
        } else {
            this.value -= amount;
        }
    }

    @Override
    public String toString() {
        return this.value + "/100";
    }
}
