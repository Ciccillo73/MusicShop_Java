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
        assertEquals("Alto", saxophone.getModel())
    }

//    @Test
//    public void getBrand() {
//    }
//
//    @Test
//    public void getMaterial() {
//    }
//
//    @Test
//    public void getType() {
//    }
//
//    @Test
//    public void getBuyingPrice() {
//    }
//
//    @Test
//    public void getSellingPrice() {
//    }
//
//    @Test
//    public void getNumberOfValves() {
//    }
}