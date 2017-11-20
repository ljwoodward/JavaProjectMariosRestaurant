package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;

/**
 * Created by janemackay on 18/11/2017.
 */

public class Dish extends LaCarteItem {
    private String name;
    private double price;
    protected ArrayList<Ingredient> ingredients;

    public Dish(String name, double price) {
        super(name, price);
        this.ingredients = new ArrayList<Ingredient>();
    }


    public String getIngredientsName() {
        String ingredientList = "";
        for(Ingredient ingredient : this.ingredients){
            ingredientList += ingredient.getName() + ", ";
        }
        return ingredientList;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
}
