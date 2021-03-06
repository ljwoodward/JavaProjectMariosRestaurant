package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by janemackay on 17/11/2017.
 */

public class PatronTest {

    Restaurant restaurant;
    LaCarte menu;
    Table table;
    Patron patron;
    Dish menuItem1;
    Dish menuItem2;




    @Before
    public void before() {
        restaurant = new Restaurant("Mario's");
        menu = new LaCarte();
        table = restaurant.newTable();
        menuItem1 = new Dish("Spaghetti Bolognese", 10.99, new Ingredient[]{new Ingredient("Spaghetti",
                8, 0.56), new Ingredient("Mince", 12, 2.33)});
        Ingredient[] bruschettaIngredients = new Ingredient[] {new Ingredient("Bread", 55, 0.25),
                new Ingredient("Tomato", 25, 0.20)};
        menuItem2= new Dish("Bruschetta", 4.50, bruschettaIngredients);
        patron = new Patron("patron");
        table.addPatronToTable(patron);
    }

    @Test
    public void testGetName(){
        String actual = patron.getName();
        assertEquals("patron", actual);
    }

    @Test
    public void testPatronCanOrder() {
        patron.orderDishFromMenu(menuItem1);
        int actual = patron.getOrder().size();
        assertEquals(1, actual);
    }

    @Test
    public void testGetOrderList() {
        patron.orderDishFromMenu(menuItem1);
        patron.orderDishFromMenu(menuItem2);
        String actual = patron.getOrderList();
        assertEquals("Spaghetti Bolognese\nBruschetta\n", actual);
    }

}