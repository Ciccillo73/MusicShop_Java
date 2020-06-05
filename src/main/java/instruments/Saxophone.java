package instruments;

public class Saxophone extends Instruments{

    private String numberOfValves;

    public Saxophone(String model, String brand, String material, InstrumentType type, double buyingPrice, double sellingPrice, String numberOfValves) {
        super(model, brand, material, type, buyingPrice, sellingPrice);
        this.numberOfValves = numberOfValves;
    }

    public String getNumberOfValves() {
        return numberOfValves;
    }
}
