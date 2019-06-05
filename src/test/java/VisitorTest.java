import ParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorTest {

Visitor visitor;

@Before
    public void setUp() {
    visitor = new Visitor(12, 100, 70);
    }
@Test
public void canGetAge () {
    assertEquals(12, visitor.getAge());
}

    @Test
    public void canGetHeight () {
        assertEquals(100, visitor.getHeight());
    }

    @Test
    public void canGetMoney () {
        assertEquals(70, visitor.getMoney());
    }

}

