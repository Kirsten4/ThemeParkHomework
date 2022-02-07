package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Visitor visitor5;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11, 1.44, 40.0);
        visitor2 = new Visitor(12, 1.44, 40.0);
        visitor3 = new Visitor(11, 1.45, 40.0);
        visitor4 = new Visitor(12, 1.45, 40.0);
        visitor5 = new Visitor(12, 2.01, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasMinHeightAndMinAge() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
        assertEquals(true, rollerCoaster.isAllowedTo(visitor4));
    }

    @Test
    public void calculateTicketPrice(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor5),0.0);
        assertEquals(8.40, rollerCoaster.priceFor(visitor1),0.0);
    }


}
