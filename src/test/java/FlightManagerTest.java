import org.junit.Before;
import org.junit.Test;



import static junit.framework.TestCase.assertEquals;
public class FlightManagerTest {
   private FlightManager flightManager;
   private Plane plane;
   private Flight flight;
 @Before
    public void before() {
     flightManager= new FlightManager();
     plane = new Plane(PlaneType.BOEING737);
     flight = new Flight(plane ,"BA123","Glagow","Hyderabad","15:20");
    }
    @Test

    public void checkBaggageWeightForPerson() {
     assertEquals(40.0,flightManager.getBaggageWeightOfEachPassenger(flight));
    }
}
