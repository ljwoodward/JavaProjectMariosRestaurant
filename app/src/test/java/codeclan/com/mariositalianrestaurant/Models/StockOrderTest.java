package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by janemackay on 22/11/2017.
 */

public class StockOrderTest {

    StockOrder stockOrder1;
    StockOrder stockOrder2;
    Ingredient ingredient1;
    Ingredient ingredient2;

    @Before
    public void setUp() {
        stockOrder1 = new StockOrder();
        ingredient1 = new Ingredient("Spaghetti", 5, 0.56);
        stockOrder2 = new StockOrder();
        ingredient2 = new Ingredient("Mince", 12, 2.25);
        stockOrder2.addToOrder(ingredient1);
        stockOrder2.addToOrder(ingredient2);
    }

    @Test
    public void testAddToOrder() {
        stockOrder1.addToOrder(ingredient1);
        int actual = stockOrder1.getOrder().size();
        assertEquals(1, actual);
    }

    @Test
    public void testGetTotalOrderPrice() {
        double actual = stockOrder2.getTotalPrice();
        assertEquals(29.80, actual, 0);
    }


}
