package codeclan.com.mariositalianrestaurant.Models;

import android.webkit.HttpAuthHandler;

import java.util.HashMap;

/**
 * Created by janemackay on 22/11/2017.
 */

public class OrderList {

    public HashMap<String, Double> ingredientList;

    public OrderList() {
        this.ingredientList = new HashMap<>();
        ingredientList.put("Spaghetti", 0.56);
        ingredientList.put("Mince", 2.25);
        ingredientList.put("Tomatoes", 0.15);
        ingredientList.put("Garlic", 0.09);
        ingredientList.put("Parmesan", 0.39);
    }



}
