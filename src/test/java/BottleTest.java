import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {
    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle(100);
    }

    @Test
    public void volumeOf100(){
        assertEquals(100, bottle.getVolume());
    }
}
