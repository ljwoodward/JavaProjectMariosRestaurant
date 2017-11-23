package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

class LaCarte {

    private ArrayList<Dish> menu;

    public LaCarte() {
        this.menu = new ArrayList<>();
    }

    public void addToMenu(Dish dish) {
        this.menu.add(dish);
    }

}
