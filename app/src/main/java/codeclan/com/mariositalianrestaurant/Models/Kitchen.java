package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;

/**
 * Created by janemackay on 21/11/2017.
 */

public class Kitchen {

    private ArrayList<Ingredient> pantry;

    public Kitchen() {
        this.pantry = new ArrayList<>();
    }

    public void addToPantry(Ingredient ingredient) {
        this.pantry.add(ingredient);
    }

}
