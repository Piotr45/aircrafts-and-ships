package ports;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.util.Pair;
import other.TravelRoute;
import vehicles.Aircraft;
import vehicles.PassengerAircraft;

public class CivilianAirport extends Airport {

    public CivilianAirport(String name, Pair<Double, Double> coordinates) {
        super(name, coordinates);
    }

    public CivilianAirport() {
        super();
    }

    @Override
    public Aircraft createAircraft(Pair<Double, Double> coordinates, int maximumAmountOfPassengers,
                                   int currentAmountOfPassengers, int id,int amountOfStaff, Airport lastVisitedAirport,
                                   Airport nextAirport, TravelRoute travelRoute) {
        return new PassengerAircraft(coordinates, maximumAmountOfPassengers, currentAmountOfPassengers, id, amountOfStaff, lastVisitedAirport, nextAirport, travelRoute);
    }

    @Override
    public String toString() {
        return this.getName() + " Airport";
    }
}
