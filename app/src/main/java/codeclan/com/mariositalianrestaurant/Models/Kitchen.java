package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by janemackay on 21/11/2017.
 */

public class Kitchen {

//     private HashMap<String, Integer> pantry;
//
//    public Kitchen() {
//        this.pantry = new HashMap<String, Integer>();
//
//    }
//
//    public void addToPantry(Ingredient ingredient, Integer quantity) {
//        String ingredientName = ingredient.getName();
//        if(!this.pantry.containsKey(ingredientName)) {
//            this.pantry.put(ingredientName, quantity);
//        } else if(this.pantry.containsKey(ingredientName)){
//            Integer newTotal = this.pantry.get(ingredientName);
//            newTotal += quantity;
//            this.pantry.remove(ingredientName);
//            this.pantry.put(ingredientName, newTotal);
//        }
//    }

    private ArrayList<Ingredient> pantry;
    private ArrayList<ArrayList<LaCarteItem>> currentOrders;


    public Kitchen() {
        this.pantry = new ArrayList<>();
        this.currentOrders = new ArrayList<>();
    }

    public void addToPantry(Ingredient newIngredient) {
        boolean isAlreadyThere = false;
        OrderItem itemToUpdate = null;
        for (OrderItem orderItem : this.getPantry()){
            if (orderItem.getName() == newIngredient.getName()) {
                isAlreadyThere = true;
                itemToUpdate = orderItem;
            } else {
                isAlreadyThere = false;
            }
        }
        if(isAlreadyThere == true) {
            itemToUpdate.increasePortion(newIngredient.getPortions());
        } else if (isAlreadyThere == false) {
            this.pantry.add(newIngredient);
        }
    }

    public ArrayList<Ingredient> getPantry() {
        return this.pantry;
    }


    public void addOrder(ArrayList<LaCarteItem> order) {
        this.currentOrders.add(order);
    }

}
