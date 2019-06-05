package ParkStuff.stalls;

import ParkStuff.Visitor;

public interface ISecurity {

    boolean isAllowedTo(Visitor visitor);

}
