package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by janemackay on 21/11/2017.
 */

public class KitchenTest {

    Kitchen kitchen;
    Ingredient ingredient1;
    Ingredient ingredient2;

    @Before
    public void setUp() {
        kitchen = new Kitchen();
        ingredient1 = new Ingredient("Spaghetti", 50);
        ingredient2 = new Ingredient("Mince", 1);
    }

    @Test
    public void testAddToPantry() {
        kitchen.addToPantry(ingredient1);
        kitchen.addToPantry(ingredient2);
        int actual = kitchen.getPantry().size();
        assertEquals(2, actual);
    }
}
