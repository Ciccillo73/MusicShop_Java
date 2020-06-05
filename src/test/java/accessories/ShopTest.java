package accessories;

import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ShopTest {

    Shop shop;
    ISell drumsTick;
    @Before
    public void setUp() {
        shop = new Shop();
        drumsTick = new DrumsTick("2", "Yamaha",5,10);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddToStock(){
        shop.addStock(drumsTick);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addStock(drumsTick);
        shop.removeStock(drumsTick);
        assertEquals(0, shop.countStock());
    }

}