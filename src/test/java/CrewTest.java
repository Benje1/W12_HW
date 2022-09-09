import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewTest {

    CabinMember firstOfficer;
    CabinMember purser;
    CabinMember flightAttendant;
    Pilot pilot;

    @Before
    public void before() {
        firstOfficer = new CabinMember("Bob", CrewRank.FIRSTOFFICER);
        purser = new CabinMember("Bobbie", CrewRank.PURSER);
        flightAttendant = new CabinMember("Bobet", CrewRank.FLIGHTATTENDANT);
        pilot = new Pilot("Bobst", CrewRank.CAPTAIN, "5");
    }

    @Test
    public void getNameOfCrewMember() {
        assertEquals("Bob", firstOfficer.getName());
    }

    @Test
    public void GetRankOfCrewMember() {
        assertEquals(CrewRank.PURSER, purser.getRank());
    }

    @Test
    public void getPilotLicence() {
        assertEquals("5", pilot.getPilotLicence());
    }

    @Test
    public void pilotCanFly() {
        assertEquals("Departed and landed", pilot.flyPlane());
    }

    @Test
    public void canCrewTalkToPassnegers() {
        assertEquals("Here is your lunch", this.flightAttendant.talk());
    }
}
