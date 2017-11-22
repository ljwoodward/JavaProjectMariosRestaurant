package codeclan.com.mariositalianrestaurant.Models;

/**
 * Created by janemackay on 18/11/2017.
 */

public class Ingredient extends OrderItem implements Orderable {

    private String name;
    private int portions;

    public Ingredient(String name, int portions, double pricePerPortion) {
        super(name, portions, pricePerPortion);
    }




}
