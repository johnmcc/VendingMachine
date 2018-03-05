import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrayTest {
    private Tray tray;

    @Before
    public void setUp() throws Exception {
        tray = new Tray(0.50, 10);
    }

    // Check trays have a price
    @Test
    public void testTrayPrice() {
        assertEquals(0.50, tray.getPrice(), 0.01);
    }


    // Check that trays can report the number of items they contain

    // Check that we can add an item to a tray

    // Check we can remove an item from a tray

    // check that we can't add items beyond a tray's capacity
}