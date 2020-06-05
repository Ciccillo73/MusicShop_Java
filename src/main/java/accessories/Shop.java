package accessories;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addStock(ISell item) {
        this.stock.add(item);
    }

    public void removeStock(ISell item) {
        if(stock.contains(item)) {
            this.stock.remove(item);
        }
    }
}
