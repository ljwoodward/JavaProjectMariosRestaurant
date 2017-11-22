package codeclan.com.mariositalianrestaurant.Models;

/**
 * Created by janemackay on 18/11/2017.
 */

class Ingredient implements Orderable {

    private String name;
    private int portions;

    public Ingredient(String name, int portions) {
        this.name = name;
        this.portions = portions;
    }

    public String getName() {
        return name;
    }

    public int getPortions() {
        return portions;
    }

    public void setAvailablePortions(int availablePortions) {
        this.portions = availablePortions;
    }

    public double getPricePerUnit() {
    }
}
