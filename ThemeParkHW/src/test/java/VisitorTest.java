import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before () {
        visitor = new Visitor(12, 150, 30.30);
    }

    @Test
    public void hasAge() {
        assertEquals(12, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(150, visitor.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(30.30, visitor.getMoney(), 0);
    }

}
