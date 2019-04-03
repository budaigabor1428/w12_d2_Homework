import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobacoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Candy Floss Stall", "Jim Jones", 3);
    }

    @Test
    public void hasName() {
        assertEquals("Candy Floss Stall", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Jim Jones", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(3, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasPrice() {
        assertEquals(0, tobaccoStall.getPrice(), 0);
    }
}
