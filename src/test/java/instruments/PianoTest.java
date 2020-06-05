package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
    piano = new Piano("2","Yamaha", "wood", InstrumentType.KEYBOARD, 2000, 4000,6);

    }

    @Test
    public void getModel() {
        assertEquals(2, piano.getModel());
    }

    @Test
    public void getBrand() {
        assertEquals("Yamaha", piano.getBrand());
    }
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
//    public void getOctaveNumber() {
//    }
}