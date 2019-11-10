import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
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
    public void planeTypeCapacityTest(){
        assertEquals(40,plane.getPlaneType().getCapacity());
    }

    @Test
    public void getFlightnumberTest() {
        assertEquals("BA123",flight.getflightNumber());
    }
}
