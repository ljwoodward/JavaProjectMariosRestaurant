package codeclan.com.mariositalianrestaurant.Models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by janemackay on 17/11/2017.
 */

public class TableTest {

    Table table;
    Table table2;
    Patron patron1;
    Patron patron2;

    @Before
    public void setUp() {
        table = new Table();
        table2 = new Table(4);
    }

    @Test
    public void testAddPatronToTable() {
        table.addPatronToTable(patron1);
        table.addPatronToTable(patron2);
        int actual = table.getNumberOfPatrons();
        assertEquals(2, actual);

    }


    @Test
    public void testNumberOfPatrons() {
        int actual = table2.getNumberOfPatrons();
        assertEquals(4, actual);
    }

    @Test
    public void testPatronsAreDynamicallyNamed() {
        String actual = "";
        for(Patron patron : table2.patrons){
            String name = patron.getName();
            actual += name + " ";
        }
        assertEquals("patron1 patron2 patron3 patron4 ", actual);

    }
}
