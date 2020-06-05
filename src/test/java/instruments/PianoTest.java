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
        assertEquals("2", piano.getModel());
    }

    @Test
    public void getBrand() {
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(2000, piano.getBuyingPrice(),0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(4000, piano.getSellingPrice(),0.01);
    }

    @Test
    public void getOctaveNumber() {
        assertEquals(6, piano.getOctaveNumber());
    }
}