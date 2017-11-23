//package codeclan.com.mariositalianrestaurant.Models;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
///**
// * Created by janemackay on 17/11/2017.
// */
//
//public abstract class LaCarteItem {
//
//    String name;
//    double price;
//    Ingredient[] ingredients;
//
//    public LaCarteItem(String name, double price, Ingredient[] ingredients) {
//        this.name = name;
//        this.price = price;
//        this.ingredients = ingredients;
//    }
//
//    public LaCarteItem(String name, double price) {
//        this.name = name;
//        this.price = price;
//        this.ingredients = null;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return this.price;
//    }
//
//    public ArrayList<Ingredient> getIngredientsList() {
//        ArrayList<Ingredient> ingredientsArrayList = new ArrayList(Arrays.asList(this.ingredients));
//        return ingredientsArrayList;
//    }
//}
//
