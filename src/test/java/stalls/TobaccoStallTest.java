package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;


    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", 4, ParkingSpot.B1);
        visitor1 = new Visitor(17, 1.2, 40.0);
        visitor2 = new Visitor(18, 1.2, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasRating() {
        assertEquals(4, tobaccoStall.getRating());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasMinimumAge(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }
}
