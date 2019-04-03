import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Candy Floss Stall", "Jim Jones", 3);
    }

    @Test
    public void hasName() {
        assertEquals("Candy Floss Stall", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Jim Jones", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(3, candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasPrice() {
        assertEquals(0, candyFlossStall.getPrice(), 0);
    }
}
