/**
 * @author SEB
 */

public class PaymentTerminal {
    private double money; 
    private int soldAffordableMeals; 
    private int soldHeartyMeals; 
    private static final double affordableMealPrice = 2.5;
    private static final double heartyMealPrice = 4.3;

    public PaymentTerminal() {
        this.money = 1000;
        this.soldAffordableMeals = 0;
        this.soldHeartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if (payment < affordableMealPrice) {
            return payment;
        }

        this.soldAffordableMeals++;
        this.money += affordableMealPrice;
        return payment - affordableMealPrice;

    }

    public double eatHeartily(double payment) {
        if (payment < heartyMealPrice) {
            return payment;
        }

        this.soldHeartyMeals++;
        this.money += heartyMealPrice;
        return payment - heartyMealPrice;

    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= affordableMealPrice) {
            this.soldAffordableMeals++;
            card.takeMoney(affordableMealPrice);
            return true;
        }

        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= heartyMealPrice) {
            this.soldHeartyMeals++;
            card.takeMoney(heartyMealPrice);
            return true;
        }

        return false;
    }

    public void addMoneyToCard(PaymentCard card, double summa) {
        if (summa > 0) {
            this.money += summa;
            card.addMoney(summa);
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + soldAffordableMeals
                + ", number of sold hearty meals: " + soldHeartyMeals;
    }
}