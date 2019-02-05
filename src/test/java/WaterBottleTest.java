import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    // before below can be anything
    // this Before is created before each test, otherwise the value would be affected.
    public void before(){
    waterbottle = new WaterBottle();
    }

    @Test
    public void shouldStartWithVolume100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void takesDrink(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void emptyWaterBottle(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void refillWaterBottle(){
        waterbottle.empty();
        waterbottle.refill();
        assertEquals(100, waterbottle.getVolume());
    }
}
