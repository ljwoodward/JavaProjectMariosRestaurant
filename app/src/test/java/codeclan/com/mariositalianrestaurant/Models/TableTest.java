package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;

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
        LaCarte menu = new LaCarte();
        restaurant = new Restaurant("Mario's", menu);
        table1 = new Table(restaurant);
        table2 = new Table(restaurant);
        patron1 = new Patron("Duncan", restaurant);
        patron2 = new Patron("Rita", restaurant);
        patron3 = new Patron("Brian", restaurant);
        table1.addPatronToTable(patron1);
        table2.addPatronToTable(patron2);
        table1.addPatronToTable(patron3);
        ingredient1 = new Ingredient("Spaghetti", 50);
        ingredient2 = new Ingredient("Mince", 9);
        ingredient3 = new Ingredient("Pancetta", 1);
        dish1 = new Dish("Spaghetti Bolognese", 9.99);
        dish2 = new Dish("Spaghetti Carbonara", 10.99);
        dish3 = new Dish("Garlic Bread", 2.02);
        dish1.addIngredient(ingredient1);
        dish1.addIngredient(ingredient2);
        dish2.addIngredient(ingredient1);
        dish2.addIngredient(ingredient3);
        patron1.orderDishFromMenu(dish1);
        patron2.orderDishFromMenu(dish2);
        patron3.orderDishFromMenu(dish2);
    }

    @Test
    public void testAddPatronToTable() {
        table1.addPatronToTable(new Patron("Bolingbroke", restaurant));
        int actual = table1.getNumberOfPatrons();
        assertEquals(2, actual);


    }


    @Test
    public void testNumberOfPatrons() {
        int actual = table2.getNumberOfPatrons();
        assertEquals(1, actual);
    }

//    @Test
//    public void testPatronsAreDynamicallyNamed() {
//        String actual = "";
//        for(Patron patron : table2.patrons){
//            String name = patron.getName();
//            actual += name + " ";
//        }
//        assertEquals("patron1 patron2 patron3 patron4 ", actual);
//
//    }

    @Test
    public void testGetOrder() {
        String actual = table1.getOrderList();
        assertEquals("Table 0:\nSpaghetti Bolognese\n", actual);
    }

    @Test
    public void testAddToTableOrder() {
        patron1.orderDishFromMenu(dish2);
        String actual = table1.getOrderList();
        assertEquals("Table 0:\nSpaghetti Bolognese\nSpaghetti Carbonara\n", actual);
    }

    @Test
    public void testGetIngredients() {
        String actual = dish1.getIngredientsName();
        assertEquals("Spaghetti, Mince, ", actual);
    }

    @Test
    public void testAvailablePortions() {
        int actual = ingredient1.getAvailablePortions();
        assertEquals(48, actual);
    }

    @Test
    public void testSplitBillEqually() {
        Patron patron = new Patron("Rumpole", restaurant);
        table1.addPatronToTable(patron);
        patron1.orderDishFromMenu(dish3);
        double actual = table1.splitBillEqually();
        assertEquals(7.66, actual, 0.01);
    }
}
