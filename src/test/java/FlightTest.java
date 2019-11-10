import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private ArrayList<Passenger>passengers = new ArrayList<Passenger>();
    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737);
        flight = new Flight(plane ,"BA123","Glagow","Hyderabad","15:20");
    }
    @Test
    public void startsWithEmptyPassengers(){
        assertEquals(0,flight.getPassengersCount());
    }
    @Test
    public void planeTypeTest(){
        assertEquals(PlaneType.BOEING737,plane.getPlaneType());
    }
    @Test
    public void planeTypeCapacityTest() {
        assertEquals(40, plane.getPlaneType().getCapacity());
    }

    @Test
    public void getFlightnumberTest() {
        assertEquals("BA123",flight.getflightNumber());
    }

    @Test
    public void getNumberOfSeatsAvailable() {
        assertEquals(40,flight.getNumberOfSeatsAvailable());
    }
    @Test
    public void bookFlightTest() {
        passenger1 = new Passenger("Sree",1);
        passenger2= new Passenger("Uday",1);
        passengers.add(passenger1);
        passengers.add(passenger2);
        flight.addBooking(passengers);
        assertEquals(38,flight.getNumberOfSeatsAvailable());
    }

}
