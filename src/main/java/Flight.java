import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger>passengers ;
    private Plane plane ;
    private String flightNumber ;
    private String destination;
    private String departureAirport;
    private String departureTime ;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers=new ArrayList<Passenger>();
    }

    public int getPassengersCount() {
        return passengers.size();
    }

    public String getflightNumber() {
        return flightNumber;
    }
}

