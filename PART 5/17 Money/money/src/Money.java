/**
 * @author SEB
 */

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros(), this.cents + addition.cents());

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        } else if (this.euros < compared.euros()) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros();
        int newCents;
        if (this.cents < decreaser.cents()){
            newCents = (this.cents + 100) - decreaser.cents();
            newEuros--;
        } else {
            newCents = this.cents - decreaser.cents();
        }
        
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }
        return new Money(newEuros, newCents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
