/**
 * @author SEB
 */

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.price = this.pricePerSquare * this.squares;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }

    public int getPrice() {
        return price;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        if (this.price >= compared.price) {
            return this.price - compared.price;
        }
        return compared.price - this.price;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.price > compared.price) {
            return true;
        }
        return false;
    }

}
