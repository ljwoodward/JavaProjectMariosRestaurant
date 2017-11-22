package codeclan.com.mariositalianrestaurant.Models;

import android.webkit.HttpAuthHandler;

import java.util.HashMap;

/**
 * Created by janemackay on 22/11/2017.
 */

public class OrderList {

    public HashMap<String, Double> orderList;

    public OrderList() {
        this.orderList = new HashMap<>();
        orderList.put("Spaghetti", 0.56);
        orderList.put("Mince", 2.25);
        orderList.put("Tomatoes", 0.15);
        orderList.put("Garlic", 0.09);
        orderList.put("Parmesan", 0.39);
    }



}
