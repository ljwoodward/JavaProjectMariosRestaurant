package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by janemackay on 17/11/2017.
 */

public class TableTest {

    Restaurant restaurant;
    LaCarte menu;
    Table table1;
    Table table2;
    Patron patron1;
    Patron patron2;
    Patron patron3;
    Ingredient ingredient1;
    Ingredient ingredient2;
    Ingredient ingredient3;
    Dish dish1;
    Dish dish2;
    Dish dish3;

    @Before
    public void setUp() {
        menu = new LaCarte();
        restaurant = new Restaurant("Mario's");
        table1 = restaurant.newTable();
        table2 = restaurant.newTable();
        patron1 = table1.newPatron();
        patron2 = table2.newPatron();
        patron3 = table1.newPatron();
        ingredient1 = new Ingredient("Spaghetti", 50, 0.56);
        ingredient2 = new Ingredient("Mince", 9, 2.25);
        ingredient3 = new Ingredient("Pancetta", 1, 1.99);
        Ingredient[] bologneseIngredients = { ingredient1, ingredient2 };
        Ingredient[] carbonaraIngredients = { ingredient1, ingredient3};
        dish1 = new Dish("Spaghetti Bolognese", 9.99, bologneseIngredients);
        dish2 = new Dish("Spaghetti Carbonara", 10.99, carbonaraIngredients);
        dish3 = new Dish("Garlic Bread", 2.02, new Ingredient[]{new Ingredient("Garlic",
                8, 0.08), new Ingredient("Bread", 12, 0.25)});
        menu.addToMenu(dish1);
        menu.addToMenu(dish2);
        menu.addToMenu(dish3);
        patron1.orderDishFromMenu(dish1);
        patron2.orderDishFromMenu(dish2);
        patron3.orderDishFromMenu(dish2);
        //table1 has 2 patrons and 2 dishes (bolognese and carbonara: 20.98)
    }

    @Test
    public void testAddPatronToTable() {
        table1.newPatron();
        int actual = table1.getNumberOfPatrons();
        assertEquals(3, actual);


    }

    @Test
    public void testNumberOfPatrons() {
        int actual = table1.getNumberOfPatrons();
        assertEquals(2, actual);
    }

    @Test
    public void testGetOrder() {
        table1.tableOrder();
        String actual = table1.getOrderList();
        assertEquals("Table 1:\nSpaghetti Bolognese\nSpaghetti Carbonara\n", actual);
    }

    @Test
    public void testAddToTableOrder() {
        patron1.orderDishFromMenu(dish2);
        table1.tableOrder();
        String actual = table1.getOrderList();
        assertEquals("Table 1:\nSpaghetti Bolognese\nSpaghetti Carbonara\nSpaghetti Carbonara\n", actual);
    }

    @Test
    public void testAvailablePortions() {
        int actual = ingredient1.getPortions();
        assertEquals(47, actual);
    }

    @Test
    public void testGetTotalBill() {
        table1.tableOrder();
        double actual = table1.getTotalBill();
        assertEquals(20.98, actual, 0);
    }
    @Test
    public void testSplitBillEqually() {
        Patron patron = table1.newPatron();
        patron.orderDishFromMenu(dish3);
        table1.tableOrder();
        double actual = table1.splitBillEqually();
        assertEquals(7.67, actual, 0.01);
    }

    @Test
    public void testSplitBillByPatron() {
        String actual = table1.splitBillByPatron();
        assertEquals("Table 1, Patron 1: 9.99\nTable 1, Patron 2: 10.99\n", actual);
    }
}
