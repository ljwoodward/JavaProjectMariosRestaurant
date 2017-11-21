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
        restaurant = new Restaurant("Mario's", menu);
        menu = new LaCarte();
        table = new Table(restaurant);
        menuItem1 = new Dish("Spaghetti Bolognese", 10.99);
        menuItem2= new Dish("Bruschetta", 4.50);
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