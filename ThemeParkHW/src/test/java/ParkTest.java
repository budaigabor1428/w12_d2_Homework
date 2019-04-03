import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before () {

        park = new Park("Jurassic Park");
    }


    @Test
    public void hasName () {
        assertEquals("Jurassic Park", park.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(0, park.getPrice(), 0);
    }

}
