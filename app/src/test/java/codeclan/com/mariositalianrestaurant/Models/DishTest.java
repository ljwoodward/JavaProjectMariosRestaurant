package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by janemackay on 21/11/2017.
 */

public class DishTest {

    Ingredient ingredient1;
    Ingredient ingredient2;
    Ingredient ingredient3;
    Ingredient ingredient4;
    Ingredient ingredient5;
    Ingredient[] ingredients;
    Dish dish1;

    @Before
    public void setUp() {
        ingredient1 = new Ingredient("Spaghetti", 50);
        ingredient2 = new Ingredient("Tomatoes", 45);
        ingredient3 = new Ingredient("Anchovies", 3);
        ingredient4 = new Ingredient("Olives", 1);
        ingredient5 = new Ingredient("Tuna", 4);
        ingredients = new Ingredient[] {ingredient1, ingredient2, ingredient3, ingredient4};
        dish1 = new Dish("Spaghetti Alla Putanesca", 8.99, ingredients);

    }

    @Test
    public void testGetIngredients() {
        String actual = dish1.getIngredientsName();
        assertEquals("Spaghetti, Tomatoes, Anchovies, Olives, ", actual);
    }

    @Test
    public void testCustomizeDishRemoveIngredient() {
        dish1.customize(ingredient3);
        String actual = dish1.getIngredientsName();
        assertEquals("Spaghetti, Tomatoes, Olives, ", actual);
    }

    @Test
    public void testCustomizeDishReplaceIngredient() {
        dish1.customize(ingredient3, ingredient5);
        String actual = dish1.getIngredientsName();
        assertEquals("Spaghetti, Tomatoes, Olives, Tuna, ", actual);
    }

}
