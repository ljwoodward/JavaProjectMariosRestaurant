package codeclan.com.mariositalianrestaurant.Models;

/**
 * Created by janemackay on 17/11/2017.
 */

public abstract class LaCarteItem {

    String name;
    double price;

    public LaCarteItem(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }
}
