package codeclan.com.mariositalianrestaurant.Models;

/**
 * Created by janemackay on 18/11/2017.
 */

class Ingredient {

    private String name;
    private int availablePortions;

    public Ingredient(String name, int availablePortions) {
        this.name = name;
        this.availablePortions = availablePortions;
    }

    public String getName() {
        return name;
    }

    public int getAvailablePortions() {
        return availablePortions;
    }

    public void setAvailablePortions(int availablePortions) {
        this.availablePortions = availablePortions;
    }
}
