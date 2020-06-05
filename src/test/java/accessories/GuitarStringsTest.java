package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarStringsTest {


    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new GuitarStrings("1", "Gibson", 10,20);
    }

    @Test
    public void getModel() {
        assertEquals("1", guitarStrings.getModel());
    }

    @Test
    public void getBrand() {
        assertEquals("Gibson",guitarStrings.getBrand());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(10, guitarStrings.getSellingPrice(),0.01);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(20, guitarStrings.getBuyingPrice(),0.01);
    }
}