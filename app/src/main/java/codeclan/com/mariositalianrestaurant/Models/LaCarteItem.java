package codeclan.com.mariositalianrestaurant.Models;

/**
 * Created by janemackay on 17/11/2017.
 */

public abstract class LaCarteItem {

    String name;
    double price;
    int portions;

    public LaCarteItem(String name, double price, int portions) {
        this.name = name;
        this.price = price;
        this.portions = portions;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return this.price;
    }
}

