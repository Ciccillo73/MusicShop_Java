package accessories;

public class MusicSheets extends Accessory{

    private int numberOfPages;



    public MusicSheets(String model, String brand, double sellingPrice, double buyingPrice, int numberOfPages) {
        super(model, brand, sellingPrice, buyingPrice);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
