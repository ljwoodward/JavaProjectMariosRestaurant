package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mariositalianrestaurant.Models.Ingredient;

import static org.junit.Assert.assertEquals;

/**
 * Created by janemackay on 22/11/2017.
 */

public class OrderItemTest {

    Ingredient ingredient1;

    @Before
    public void setUp() {
        ingredient1 = new Ingredient("Spaghetti", 5, 0.56);
    }

    @Test
    public void testGetIngredientName() {
        String actual = ingredient1.getName();
        assertEquals("Spaghetti", actual);
    }

    @Test
    public void useIngredient() {
        ingredient1.usePortionOfOrderItem();
        int actual = ingredient1.getPortions();
        assertEquals(4, actual);
    }

    @Test
    public void testGetTotalPriceOfItem() {
        double actual = ingredient1.getTotalPrice();
        assertEquals(2.80, actual, 0);
    }
}
