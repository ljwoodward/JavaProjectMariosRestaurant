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
    Patron patron1;
    Patron patron2;
    Patron patron3;
    LaCarte menu;
    Restaurant restaurant;
    Dish dish1;
    Dish dish2;
    Ingredient ingredient1;
    Ingredient ingredient2;
    Ingredient ingredient3;


    @Before
    public void before() {
        restaurant = new Restaurant("Mario's Italian Restaurant", menu);
        table1 = restaurant.newTable();
        table2 = restaurant.newTable();
        patron1 = new Patron("Rutger", restaurant);
        patron2 = new Patron("Wilhemina", restaurant);
        patron3 = new Patron("Gogarian", restaurant);
        table1.addPatronToTable(patron1);
        table1.addPatronToTable(patron2);
        table2.addPatronToTable(patron3);
        menu = new LaCarte();
        ingredient1 = new Ingredient("Mince", 12);
        ingredient2 = new Ingredient("Spaghetti", 80);
        ingredient3 = new Ingredient("Pancetta", 4);
        dish1 = new Dish("Spaghetti Bolognese", 10.99);
        dish1.addIngredient(ingredient1);
        dish1.addIngredient(ingredient2);
        dish2 = new Dish("Spaghetti Carbonara", 9.99);
        dish2.addIngredient(ingredient2);
        dish2.addIngredient(ingredient3);
        menu.addToMenu(dish1);
        menu.addToMenu(dish2);
        patron1.orderDishFromMenu(dish1);
        patron2.orderDishFromMenu(dish2);
        patron3.orderDishFromMenu(dish2);

    }

    @Test
    public void testNewTable() {
        restaurant.newTable();
        int actual = restaurant.getTables().size();
        assertEquals(3, actual);
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
        assertEquals("Table 0:\nSpaghetti Bolognese\nSpaghetti Carbonara\n\nTable 1:\nSpaghetti Carbonara\n\n", actual);
    }

    @Test
    public void testGetDishPrice() {
        double actual = dish1.getPrice();
        assertEquals(10.99, actual, 0);
    }
}
