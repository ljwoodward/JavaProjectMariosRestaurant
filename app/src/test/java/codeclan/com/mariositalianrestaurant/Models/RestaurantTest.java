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
    Restaurant mariosItalianRestaurant;


    @Before
    public void setUp() {
        table = new Table();
        menu = new LaCarte();
        mariosItalianRestaurant = new Restaurant("Mario's Italian Restaurant", menu);
    }

    @Test
    public void testNewTable() {
        mariosItalianRestaurant.newTable(table);
        int actual = mariosItalianRestaurant.getTables().size();
        assertEquals(1, actual);
    }
}
