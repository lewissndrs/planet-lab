import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlanet {

    Planet pluto;

    @Before
    public void before() {
        pluto = new Planet("Pluto",101);
    }

    @Test
    public void hasName() {
        assertEquals("Pluto",pluto.getName());
    }

    @Test
    public void hasSize() {
        assertEquals(101, pluto.getSize());
    }
}
