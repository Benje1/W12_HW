import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassenterTest {

    public Passenger passenger;
    public Passenger passenger2;
    public Passenger passenger3;

    @Before
    public void setUp() throws Exception {
        passenger = new Passenger("Phillip", 1);
        passenger2 = new Passenger("Filip", 2);
        passenger3 = new Passenger("Phill", 0);

    }

    @Test
    public void passengerHasName() {
        assertEquals("Phillip", passenger.getName());
    }

    @Test
    public void passengerHasBaggaseWieght() {
        assertEquals(15, passenger.getBaggageWieght() );
    }

    @Test
    public void passengerBaggegeIsCalculatingWieght() {
        assertEquals(30, passenger2.getBaggageWieght());
    }
}
