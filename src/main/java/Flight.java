import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger>bookedPassengers ;
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
        this.bookedPassengers=new ArrayList<Passenger>();
    }

    public int getPassengersCount() {
        return bookedPassengers.size();
    }

    public String getflightNumber() {

        return flightNumber;
    }

    public ArrayList<Passenger> getPassengers() {
        return bookedPassengers;
    }

    public int getNumberOfSeatsAvailable() {
        int totalCapacity = plane.getPlaneType().getCapacity()-bookedPassengers.size();
        return  totalCapacity;
    }

   private void addPassenger(Passenger passenger1) {
         bookedPassengers.add(passenger1);
    }

    public void addBooking(ArrayList<Passenger> passengers) {
        if (getNumberOfSeatsAvailable() >= passengers.size()) {
            bookedPassengers.addAll(passengers);
        }
    }
    public double getPlaneWeight(){
        return plane.getPlaneType().getWeight();
    }
    public int getPlaneCapacity(){
        return plane.getPlaneType().getCapacity();
    }

}

