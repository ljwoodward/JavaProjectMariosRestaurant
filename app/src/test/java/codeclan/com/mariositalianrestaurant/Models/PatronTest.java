package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;

/**
 * Created by janemackay on 17/11/2017.
 */

public class PatronTest {

    Patron patron;
    LaCarteItem menuItem;

    @Before
    public void before() {
        menuItem = new Food("Spaghetti Bolognese", 10.99);
        patron = new Patron("patron");
    }

    public void testPatronCanOrder() {
        patron.orderFromMenu(menuItem);
        int actual = patron.
    }
}