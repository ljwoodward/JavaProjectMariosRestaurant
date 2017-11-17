package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

class Patron {

    private String name;
    private ArrayList<LaCarteItem> order;

     public Patron(String name) {
        this.name = name;
        this.order = new ArrayList<LaCarteItem>();
    }

    public String getName() {
        return name;
    }

    public void orderFromMenu(LaCarteItem item) {
         this.order.add(item);
    }

}
