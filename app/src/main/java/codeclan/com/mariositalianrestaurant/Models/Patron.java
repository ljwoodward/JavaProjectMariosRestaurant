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
        this.order = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<LaCarteItem> getOrder() {
         return order;
    }

//    public Table thisTable(){
//         for(Table table : restaurant.getTables()){
//             table.patrons.contains(this);
//
//         }
//        return table;
//
//    }




    public void orderDishFromMenu(Dish item) {
         this.order.add(item);
         for (Ingredient ingredient : item.getIngredients()) {
             int newPortions = ingredient.getAvailablePortions() - 1;
             ingredient.setAvailablePortions(newPortions);
         }
    }

    public String getOrderList() {
         String orderList = "";
         for(LaCarteItem menuItem : this.order) {
             orderList += menuItem.getName() + "\n";
         }
         return orderList;
    }

    public double getCostOfOrder() {
        double cost = 0;
        for (LaCarteItem menuItem : this.order) {
            cost += menuItem.getPrice();
        }
        return cost;
    }
}
