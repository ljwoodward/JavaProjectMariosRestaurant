package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by janemackay on 21/11/2017.
 */

public class DishTest {

    Ingredient ingredient1;
    Ingredient ingredient2;
    Ingredient ingredient3;
    Ingredient ingredient4;
    Ingredient[] ingredients;
    Dish dish;

    @Before
    public void setUp() {
        ingredient1 = new Ingredient("Spaghetti", 50);
        ingredient2 = new Ingredient("Tinned tomatoes", 45);
        ingredient3 = new Ingredient("Anchovies", 3);
        ingredient4 = new Ingredient("Olives", 1);
        ingredients = new Ingredient[] {ingredient1, ingredient2, ingredient3, ingredient4};
        dish = new Dish("Spaghetti Alla Putanesca", 8.99, ingredients);

    }

    @Test
    public void testCustomiseDish() {

    }

}
