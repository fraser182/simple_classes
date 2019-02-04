import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
    waterbottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void takesDrink(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void emptyWaterBottle(){
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void refillWaterBottle(){
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.empty();
        assertEquals(100, waterbottle.fill());
    }
}
