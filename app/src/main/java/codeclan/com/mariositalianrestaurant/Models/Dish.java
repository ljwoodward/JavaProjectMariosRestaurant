package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by janemackay on 18/11/2017.
 */

public class Dish extends LaCarteItem {
    private String name;
    private double price;
    private Ingredient[] ingredients;

    public Dish(String name, double price, Ingredient[] ingredients) {
        super(name, price);
//        this.ingredients = new ArrayList(Arrays.asList(ingredients));
        this.ingredients = ingredients;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public String getIngredientsName() {
        String ingredientList = "";
        for(Ingredient ingredient : this.ingredients){
            ingredientList += ingredient.getName() + ", ";
        }
        return ingredientList;
    }

    public void addIngredient(Ingredient ingredient) {
        ArrayList<Ingredient> ingredientArrayList = new ArrayList<>(Arrays.asList(this.ingredients));
        ingredientArrayList.add(ingredient);
    }


}
