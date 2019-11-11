import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Flight {
    private ArrayList<Passenger>bookedPassengers ;
    private Plane plane ;
    private String flightNumber ;
    private String destination;
    private String departureAirport;
    private Date departureTime ;



    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime) {
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

    public void addBooking(ArrayList<Passenger> passengers) {
        Random rand = new Random();
        int randNumber = rand.nextInt(getPlaneCapacity());

        if (getNumberOfSeatsAvailable() >= passengers.size()) {
            for (Passenger passenger : passengers){
                bookedPassengers.add(passenger);
                passenger.setBookedFlight(this);
                passenger.setSeatNumber(getRandumNumber());
            }
        }
    }

//    public void addBooking(Passenger passenger) {
//        if (getNumberOfSeatsAvailable() != 0) {
//                bookedPassengers.add(passenger);
//                passenger.setBookedFlight(this);
//            }
//    }
    public double getPlaneWeight(){
        return plane.getPlaneType().getWeight();
    }
    public int getPlaneCapacity(){
        return plane.getPlaneType().getCapacity();
    }
//    public Date getDepartureTime(){
//        return departureTime;
//    }

    public int getRandumNumber(){
        Random rand = new Random();
        int randNumber = rand.nextInt(getPlaneCapacity());
        boolean isDistinct = true;
         for (Passenger passenger: bookedPassengers) {
             if(passenger.getSeatNumber() == randNumber ){
                 isDistinct = false;
                 break;
             }
         }
         if (isDistinct){
             return randNumber;
         } else {
          return    getRandumNumber();
         }
    }
}

