import Attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void before () {
        dodgem = new Dodgem("Crash");
    }

    @Test
    public void hasName () {
        assertEquals("Crash", dodgem.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(0, dodgem.getPrice(), 0);
    }
}
