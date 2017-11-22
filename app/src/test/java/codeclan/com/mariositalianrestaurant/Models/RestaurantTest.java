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
        restaurant = new Restaurant("Mario's Italian Restaurant");
        table1 = restaurant.newTable();
        table2 = restaurant.newTable();
        patron1 = table1.newPatron();
        patron2 = table2.newPatron();
        patron3 = table1.newPatron();
        menu = new LaCarte();
        ingredient1 = new Ingredient("Mince", 12, 2.25);
        ingredient2 = new Ingredient("Spaghetti", 80, 0.56);
        ingredient3 = new Ingredient("Pancetta", 4, 1.99);
        Ingredient[] bologneseIngredients = { ingredient1, ingredient2 };
        Ingredient[] carbonaraIngredients = { ingredient1, ingredient3};
        dish1 = new Dish("Spaghetti Bolognese", 10.99, bologneseIngredients);
        dish1.addIngredient(ingredient1);
        dish1.addIngredient(ingredient2);
        dish2 = new Dish("Spaghetti Carbonara", 9.99, carbonaraIngredients);
        dish2.addIngredient(ingredient2);
        dish2.addIngredient(ingredient3);
        menu.addToMenu(dish1);
        menu.addToMenu(dish2);
        patron1.orderDishFromMenu(dish1);
        patron2.orderDishFromMenu(dish2);
        patron3.orderDishFromMenu(dish2);
        restaurant.addToTill(1000.00);

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
        assertEquals(1055.55, actual, 0.0);
    }

    @Test
    public void testGetTablesList() {

        String actual = restaurant.getTablesList();
        assertEquals("Table 1:\nSpaghetti Bolognese\nSpaghetti Carbonara\n\nTable 2:\nSpaghetti Carbonara\n\n", actual);
    }

    @Test
    public void testGetDishPrice() {
        double actual = dish1.getPrice();
        assertEquals(10.99, actual, 0);
    }

    @Test
    public void testClearTableRemoveTable() {
        restaurant.clearTable(table1);
        int actual = restaurant.getTables().size();
        assertEquals(1, actual);
    }

    @Test
    public void testClearTableTillUpdates() {
        restaurant.clearTable(table1);
        double actual = restaurant.getTill();
        assertEquals(1020.98, actual, 0);
    }

    @Test
    public void testAddToNextOrder() {
        restaurant.addToNextOrder("Spaghetti", 50);
        int actual = restaurant.getNextOrder().size();
        assertEquals(1, actual);
    }

    @Test
    public void testCanOnlyAddItemFromOrderList() {
        String actual = restaurant.addToNextOrder("Tongue", 12);
        assertEquals("Not on list", actual);
    }

    @Test
    public void testAddToPendingDeliveries() {
        StockOrder order = new StockOrder();
        order.addToOrder(ingredient1);
        order.addToOrder(ingredient2);
        restaurant.addPendingDelivery(order);
        int actual = restaurant.getPendingOrders().size();
        assertEquals(1, actual);
    }

    @Test
    public void testMakeOrderOrderIsPending() {

        restaurant.makeOrder();
        int actual = restaurant.getPendingOrders().size();
        assertEquals(1, actual);
    }

    @Test
    public void testMakeOrderPriceIsDebited() {
        restaurant.addToNextOrder("Spaghetti", 50);
        restaurant.makeOrder();
        double actual = restaurant.getTill();
        assertEquals(972.00, actual, 0);
    }

}
