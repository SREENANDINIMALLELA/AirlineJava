import sun.jvm.hotspot.opto.Node_Array;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger>passengers;
    public Flight(){
        this.passengers= new ArrayList<Passenger>();
    }

    public int getPassengersCount() {
        return passengers.size();
    }
}

//    String FlightNumber,String Destination,String departureAirport,String departureTime