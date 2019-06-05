package ParkStuff.attraction;

import ParkStuff.stalls.ISecurity;
import ParkStuff.stalls.ITicketed;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {
    public Rollercoaster (String name, int rating) {
        super(name, rating);
    }



}
