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

    public Kitchen() {
        this.pantry = new ArrayList<>();
    }

    public void addToPantry(Ingredient ingredient) {
        this.pantry.add(ingredient);
    }

    public ArrayList<Ingredient> getPantry() {
        return this.pantry;
    }






}
