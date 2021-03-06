package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {
    private String model;
    private String brand;
    private double sellingPrice;
    private double buyingPrice;

    public Accessory(String model, String brand, double sellingPrice, double buyingPrice) {
        this.model = model;
        this.brand = brand;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double calculateMarkUp(){
        return this.getSellingPrice() - this.getBuyingPrice();
    }

}
