package ParkStuff.attraction;

import ParkStuff.Visitor;
import ParkStuff.stalls.ITicketed;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems (String name, int rating) {
        super(name, rating);
    }


    public int getRating() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public double defaultPrice() {
        return 0;
    }

    public double priceFor(Visitor visitor) {
        return 0;
    }
}
