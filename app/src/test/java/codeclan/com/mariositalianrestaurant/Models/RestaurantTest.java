package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by janemackay on 17/11/2017.
 */

public class RestaurantTest {
    Table table1;
    Table table2;
    LaCarte menu;
    Restaurant restaurant;
    Dish dish;
    Dish dish2;
    Ingredient ingredient1;
    Ingredient ingredient2;
    Ingredient ingredient3;


    @Before
    public void before() {
        table1 = new Table(4);
        table2 = new Table(2);
        menu = new LaCarte();
        restaurant = new Restaurant("Mario's Italian Restaurant", menu);
        dish = new Dish("Spaghetti Bolognese", 10.99);
        ingredient1 = new Ingredient("Mince", 12);
        ingredient2 = new Ingredient("Spaghetti", 80);
        ingredient3 = new Ingredient("Pancetta", 4);
        dish.addIngredient(ingredient1);
        dish.addIngredient(ingredient2);
        menu.addToMenu(dish);
        dish2 = new Dish("Spaghetti Carbonara", 9.99);
        dish2.addIngredient(ingredient2);
        dish2.addIngredient(ingredient3);
        restaurant.newTable(table1);
        restaurant.newTable(table2);
        patron1
    }

    @Test
    public void testNewTable() {
        restaurant.newTable(table1);
        int actual = restaurant.getTables().size();
        assertEquals(1, actual);
    }

    @Test
    public void testAddAndGetTill() {
        double amount = 55.55;
        restaurant.addToTill(amount);
        double actual = restaurant.getTill();
        assertEquals(55.55, actual, 0.0);
    }

    @Test
    public void testGetTablesList() {
        String actual = restaurant.getTablesList();
        assertEquals("test", actual);
    }


}
