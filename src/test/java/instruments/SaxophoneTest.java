package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() throws Exception {
        saxophone = new Saxophone("3", "Alto", "brass", InstrumentType.BRASS, 1500, 2500, 4 );
    }

    @Test
    public void getModel() {
        assertEquals("3", saxophone.getModel());
    }


    @Test
    public void getBrand() {
        assertEquals("Alto", saxophone.getBrand());
    }

    @Test
    public void getMaterial() {
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.BRASS, saxophone.getType());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(1500.00, saxophone.getBuyingPrice(),0.01);

    }

    @Test
    public void getSellingPrice() {
        assertEquals(2500.00, saxophone.getSellingPrice(),0.01);
    }

    @Test
    public void getNumberOfValves() {
        assertEquals(4, saxophone.getNumberOfValves());
    }

    @Test
    public void canMakeSound(){
        assertEquals("pua pua pua", saxophone.sound());
    }

}