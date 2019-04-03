import Attractions.Playground;
import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before () {

        playground = new Playground("Spider Land");
        visitor = new Visitor(12, 150, 30.30);
    }



    @Test
    public void hasName () {
        assertEquals("Spider Land", playground.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(0, playground.getPrice(), 0);
    }

    @Test
    public void isAllowedTo()
}
