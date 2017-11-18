package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by janemackay on 17/11/2017.
 */

public class PatronTest {

    Patron patron;
    LaCarteItem menuItem;

    @Before
    public void before() {
        menuItem = new Dish("Spaghetti Bolognese", 10.99);
        patron = new Patron("patron");
    }

    @Test
    public void testPatronCanOrder() {
        patron.orderFromMenu(menuItem);
        int actual = patron.getOrder().size();
        assertEquals(1, actual);
    }
}