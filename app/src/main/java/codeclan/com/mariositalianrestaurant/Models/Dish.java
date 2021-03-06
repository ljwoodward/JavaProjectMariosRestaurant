package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by janemackay on 18/11/2017.
 */

public class Dish {

    private String name;
    private double price;
    private Ingredient[] ingredients;


    public Dish(String name, double price, Ingredient[] ingredients) {
//        this.ingredients = new ArrayList(Arrays.asList(ingredients));
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return this.price;
    }

    public ArrayList<Ingredient> getIngredientsList() {
        ArrayList<Ingredient> ingredientsArrayList = new ArrayList(Arrays.asList(this.ingredients));
        return ingredientsArrayList;
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

    private void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }


    public void customize(Ingredient ingredient) {
        ArrayList<Ingredient> ingredientsArrayList = new ArrayList<>(Arrays.asList(this.ingredients));
        ingredientsArrayList.remove(ingredient);
        Ingredient[] newIngredients = ingredientsArrayList.toArray(new Ingredient[ingredientsArrayList.size()]);
        this.setIngredients(newIngredients);
    }

    public void customize(Ingredient ingredientToRemove, Ingredient replacementIngredient) {
        ArrayList<Ingredient> ingredientsArrayList = new ArrayList<>(Arrays.asList(this.ingredients));
        ingredientsArrayList.remove(ingredientToRemove);
        ingredientsArrayList.add(replacementIngredient);
        Ingredient[] newIngredients = ingredientsArrayList.toArray(new Ingredient[ingredientsArrayList.size()]);
        this.setIngredients(newIngredients);
    }


}
