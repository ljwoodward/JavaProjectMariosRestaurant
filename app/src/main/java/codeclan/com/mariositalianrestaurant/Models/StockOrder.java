package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;

/**
 * Created by janemackay on 22/11/2017.
 */

public class StockOrder {

    private ArrayList<Orderable> order;

    public StockOrder() {
        this.order = new ArrayList<>();
    }

    public void addToOrder(Orderable orderItem) {
        this.order.add(orderItem);
    }
}
