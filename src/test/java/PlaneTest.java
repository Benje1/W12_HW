import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    public Plane plane;
    public Passenger passenger;
    public Passenger[] passengers;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING737);
        passenger = new Passenger("Bim", 1);
        passengers = new Passenger[70];
    }

    @Test
    public void planeHasPlaneType() {
        assertEquals(PlaneType.BOEING737,  plane.getPlaneType());
    }

    @Test
    public void planeHasSeats() {
        assertEquals(70, plane.getCapacity() );
    }

    @Test
    public void planeHasWeight() {
        assertEquals(25000, plane.getTotalWeight());
    }

    @Test
    public void testPlaneCapacity() {
        assertEquals(70, plane.getCurrentPlaneCapacity());
    }

    @Test
    public void getPlaneWeight() {
        assertEquals(25000, plane.getCurrentPlaneWeight());
    }

    @Test
    public void testCurrentPassengers() {
        assertEquals(0, this.plane.getPassengersOnBoard());
    }

    @Test
    public void canReturnTrue() {
        assertEquals(true, plane.checkIfFull());
    }

    @Test
    public void canBookPassenger() {
        plane.bookPassenger(passenger);
        assertEquals(69, plane.getCurrentPlaneCapacity());
    }

    @Test
    public void canNotOverBook() {
        plane.addPassenger(passengers);
        plane.bookPassenger(passenger);
        plane.bookPassenger(passenger);
        assertEquals(0, plane.getCurrentPlaneCapacity());
    }


}
