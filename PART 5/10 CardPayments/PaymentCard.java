/**
 * @author SEB
 */

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        // Considering a method should only do one thing, idk why would I do this, but so the exercise needs it.
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
