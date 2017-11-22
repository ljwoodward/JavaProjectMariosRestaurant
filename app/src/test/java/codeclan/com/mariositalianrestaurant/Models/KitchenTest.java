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
        ingredient1 = new Ingredient("Spaghetti", 50, 0.56);
        ingredient2 = new Ingredient("Mince", 1, 2.25);
        kitchen.addToPantry(ingredient1);
        kitchen.addToPantry(ingredient2);
    }

    @Test
    public void testAddToPantry() {
        Kitchen newKitchen = new Kitchen();
        newKitchen.addToPantry(ingredient1);
        newKitchen.addToPantry(ingredient2);
        int actual = newKitchen.getPantry().size();
        assertEquals(2, actual);
    }
}
