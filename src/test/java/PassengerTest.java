import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {
    Passenger passenger;
    @Before
    public void dummy() {
        passenger = new Passenger("Sree",2);
    }

    @Test
    public void nameForPassengerTest(){
        assertEquals("Sree",passenger.getName());
    }
    @Test
    public void bagsForPassengerTest(){
        assertEquals(2,passenger.getNumberOfBags());
    }

}
