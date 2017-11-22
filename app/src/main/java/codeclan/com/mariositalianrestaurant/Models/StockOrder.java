package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;

/**
 * Created by janemackay on 22/11/2017.
 */

public class StockOrder {

   private ArrayList<OrderItem> order;

    public StockOrder() {
        this.order = new ArrayList<>();
    }

    public void addToOrder(OrderItem orderItem) {
        this.order.add(orderItem);
    }

    public ArrayList<OrderItem> getOrder() {
        return order;
    }


    public double getTotalPrice() {
        double total = 0;
        for (OrderItem orderItem : this.order) {
            total += orderItem.getTotalPrice();
        }
        return total;
    }

}
