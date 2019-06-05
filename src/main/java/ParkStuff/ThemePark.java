package ParkStuff;

import ParkStuff.attraction.Attraction;
import ParkStuff.stalls.IReviewed;
import ParkStuff.stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall>stalls;

    public ThemePark() {
        attractions = new ArrayList<Attraction>();
        stalls = new ArrayList<Stall>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
        reviewed.addAll(attractions);
        reviewed.addAll(stalls);
        return reviewed;
    }

    public void visit( Visitor visitor, Attraction attraction) {

    }
}
