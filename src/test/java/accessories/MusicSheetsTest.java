package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MusicSheetsTest {

    MusicSheets musicSheets;

    @Before
    public void setUp() throws Exception {
        musicSheets = new MusicSheets("3", "Music", 3.00,5.00,20);
    }

    @Test
    public void getModel() {
        assertEquals("3", musicSheets.getModel());
    }

    @Test
    public void getBrand() {
        assertEquals("Music", musicSheets.getBrand());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(5, musicSheets.getBuyingPrice(),0.01);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(3, musicSheets.getSellingPrice(),0.01);
    }

    @Test
    public void getNumberOfPages() {
        assertEquals(20,musicSheets.getNumberOfPages());
    }
}