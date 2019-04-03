import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before () {
        rollercoaster = new Rollercoaster("Hell Ride");
    }

    @Test
    public void hasName() {
        assertEquals("Hell Ride", rollercoaster.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(0, rollercoaster.getPrice(), 0);
    }
}
