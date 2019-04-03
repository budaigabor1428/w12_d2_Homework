import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Ice Cream Stall", "Jim Jones", 3);
    }

    @Test
    public void hasName() {
        assertEquals("Ice Cream Stall", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Jim Jones", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(3, iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasPrice() {
        assertEquals(0, iceCreamStall.getPrice(), 0);
    }
}
