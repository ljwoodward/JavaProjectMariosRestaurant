package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

class LaCarte {

    private ArrayList<LaCarteItem> menu;

    public LaCarte() {
        this.menu = new ArrayList<>();
    }

    public void addToMenu(LaCarteItem menuItem) {
        this.menu.add(menuItem);
    }

}
