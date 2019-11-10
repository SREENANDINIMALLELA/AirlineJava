import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {
    private  Passenger passenger1;
    private  Flight flight;
    private Plane plane ;
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING737);
        passenger1= new Passenger("Sree",1);
        flight = new Flight(plane ,"BA123","Glagow","Hyderabad", Calendar.getInstance().getTime());
    }

    @Test
    public void nameForPassengerTest(){
        assertEquals("Sree",passenger1.getName());
    }
    @Test
    public void bagsForPassengerTest(){
        assertEquals(1,passenger1.getNumberOfBags());
    }
    @Test

    public void  getPassengerFlightTest() {
        passengers.add(passenger1);
        flight.addBooking(passengers);
        assertEquals("BA123", passenger1.getflightNumber());
    }
    @Test

    public void  getPassengerSeatNumber() {
        passengers.add(passenger1);
        flight.addBooking(passengers);
        System.out.println( passenger1.getSeatNumber());
    }
}
