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
    private ArrayList<ArrayList<Dish>> currentOrders;


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


    public void addOrder(ArrayList<Dish> order) {
        this.currentOrders.add(order);
    }

    public ArrayList<ArrayList<Dish>> getCurrentOrders() {
        return this.currentOrders;
    }

    public Ingredient getIngredient(String name) {
        Ingredient ingredientToGet = null;
        for (Ingredient ingredient : pantry) {
            if (ingredient.getName() == name) {
                ingredientToGet = ingredient;
            }
        }
        return ingredientToGet;
    }

//    public String prepareOrder(ArrayList<Dish> orderToPrepare) {
//        String returnStatement = "";
//        for (ArrayList<Dish> order : this.currentOrders) {
//            if (order == orderToPrepare){
//                for (Dish dish : orderToPrepare) {
//                    for (Ingredient ingredient : dish.getIngredientsList()) {
//                        Ingredient ingredientToUpdate = this.getIngredient(ingredient.getName());
//                        ingredientToUpdate.usePortionOfOrderItem();
//                    }
//                } returnStatement+= "Order being prepared";
//            } else {
//                returnStatement += "Error";
//            }
//
//        }
//        return returnStatement;
//    }
}
