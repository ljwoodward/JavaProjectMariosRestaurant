package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by janemackay on 17/11/2017.
 */

public class RestaurantTest {

    Table table;
    LaCarte menu;
    Restaurant restaurant;


    @Before
    public void setUp() {
        table = new Table();
        menu = new LaCarte();
        restaurant = new Restaurant("Mario's Italian Restaurant", menu);
    }

    @Test
    public void testNewTable() {
        restaurant.newTable(table);
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
}
