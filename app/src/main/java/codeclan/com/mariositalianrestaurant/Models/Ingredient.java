package codeclan.com.mariositalianrestaurant.Models;

/**
 * Created by janemackay on 18/11/2017.
 */

public class Ingredient extends OrderItem {

    private String name;
    private int portions;
    private double pricePerPortion;

    public Ingredient(String name, int portions, double pricePerPortion) {
        super(name, portions, pricePerPortion);
    }


}
