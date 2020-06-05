package accessories;

import behaviours.ISell;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class ShopTest {

    Shop shop;
    ISell drumsTick;
    ISell guitar;

    @Before
    public void setUp() {
        shop = new Shop();
        drumsTick = new DrumsTick("2", "Yamaha",10,5);
        guitar = new Guitar("1", "Gibson", "iron", InstrumentType.STRING, 300,500, 7);

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

    @Test
    public void cannotRemoveFromStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.countStock());
        shop.removeStock(drumsTick);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canCalculatePotentialTotalMarkUp(){
        assertEquals(0, shop.countStock());
        shop.addStock(guitar);
        shop.addStock(drumsTick);
        assertEquals(2, shop.countStock());
        assertEquals(205, shop.totalMarkUp(),0.01);
    }


}