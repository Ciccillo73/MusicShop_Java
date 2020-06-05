package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumStickTest {

    GuitarStrings.DrumStick drumStick;

    @Before
    public void setUp() {
        drumStick = new GuitarStrings.DrumStick("2", "Yamaha",5,10);
    }

    @Test
    public void getModel() {
        assertEquals("2", drumStick.getModel());
    }

    @Test
    public void getBrand() {
        assertEquals("Yamaha",drumStick.getBrand());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(5, drumStick.getSellingPrice(),0.01);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(10, drumStick.getBuyingPrice(),0.01);
    }
}