import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot;
    CabinMember purser;
    CabinMember flightCrew;
    ArrayList<CabinMember> cabinCrew;
    Passenger passenger;
    Passenger[] passengers;
    Plane plane;
    Flight flight;
    Passenger baggagePassenger;

    @Before
    public void before() {
        pilot = new Pilot("Bob", CrewRank.CAPTAIN, "5");
        purser = new CabinMember("Bobbie", CrewRank.PURSER);
        flightCrew = new CabinMember("Bobby", CrewRank.FLIGHTATTENDANT);
        passenger = new Passenger("Phill", 1);
        passengers = new Passenger[70];
        plane = new Plane(PlaneType.BOEING737);
        cabinCrew = new ArrayList<>();
        cabinCrew.add(purser);
        cabinCrew.add(flightCrew);
        baggagePassenger = new Passenger("Suitcase Man", 1000000);
        flight = new Flight(pilot, cabinCrew, plane, "567", "Here", "There", "7:30");
    }

    @Test
    public void getNumberOfSeats() {
        assertEquals(70, this.flight.getNumberOfSeats());
    }

    @Test
    public void getNumberOfPassengers() {
        assertEquals(0, this.flight.getNumberOfPassengers());
    }

    @Test
    public void flightHasPilot() {
        assertEquals(pilot, this.flight.getPilot());
    }

    @Test
    public void flightHasCabinCrew() {
        assertEquals(2, this.flight.getCabinMembers());
    }

    @Test
    public void flightHasPlane() {
        assertEquals(plane, this.flight.getPlane());
    }

    @Test
    public void flightHasNumber() {
        assertEquals("567", this.flight.getFlightNumber());
    }

    @Test
    public void flightHasDeparture() {
        assertEquals("Here", this.flight.getDeparture());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("There", this.flight.getDestination());
    }

    @Test
    public void FlightHasDepartureTime() {
        assertEquals("7:30", this.flight.getDepartureTime());
    }

    @Test
    public void canBookPassenger(){
        this.flight.bookPassenger(passenger);
        assertEquals(1, this.flight.getNumberOfPassengers());
    }

    @Test
    public void canPilotFly() {
        assertEquals("Departed and landed", this.flight.flyPlane());
    }

    @Test
    public void canFlightattendanctsTalk() {
        assertEquals("Here is your lunch", this.flight.talk());
    }

    @Test
    public void canPlaneTakeOff() {
        this.flight.bookPassenger(passenger);
        assertEquals(true, this.flight.canPlaneTakeOff());
    }

    @Test
    public void planeCannotTakeOff() {
        this.flight.bookPassenger(baggagePassenger);
        assertEquals(false, this.flight.canPlaneTakeOff());
    }

    @Test
    public void howMuchIsHalfFull() {
        assertEquals(933, this.flight.howManyBagsTillHalfFull());
    }

    @Test
    public void howManyBagsPerPerson() {
        assertEquals(13, this.flight.howManyBagsPerPassenger());
    }

    @Test
    public void howMuchWeightOfBagqage() {
        this.flight.bookPassenger(passenger);
        assertEquals(6015, this.flight.weightOfPlane());
    }

    @Test
    public void howMuchWeightRemains(){
        assertEquals(34000, this.flight.weightRemains());
    }
}
