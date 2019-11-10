import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Calendar;

import static junit.framework.TestCase.assertEquals;
public class FlightManagerTest {
   private FlightManager flightManager;
   private Plane plane;
   private Flight flight;
   private Passenger passenger1;
   private Passenger passenger2;
   private ArrayList<Passenger>passengers=new ArrayList<Passenger>();
 @Before
    public void before() {
     flightManager= new FlightManager();
     plane = new Plane(PlaneType.BOEING737);
     flight = new Flight(plane ,"BA123","Glasgow","Hyderabad", Calendar.getInstance().getTime());
     passenger1 = new Passenger("Sree",1);
     passenger2= new Passenger("Uday",1);
     passengers.add(passenger1);
     passengers.add(passenger2);
     flight.addBooking(passengers);
    }
    @Test

    public void checkBaggageWeightForPerson() {
     assertEquals(40.0,flightManager.getBaggageWeightOfEachPassenger(flight));
    }

    @Test
    public void checkRemaingBaggageWeight(){
     assertEquals(1520.0, flightManager.getRemainingBaggageWeight(flight));
    }
    @Test
    public void checkFilledBaggageWeight(){
        assertEquals(80.0, flightManager.getFilledPassengersBaggageWeight(flight));
    }
}
