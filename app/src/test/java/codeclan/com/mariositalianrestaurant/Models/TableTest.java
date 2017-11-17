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
    }

    @Test
    public void testAddPatronToTable() {
        table.addPatronToTable(patron1);
        table.addPatronToTable(patron2);
        int actual = table.getNumberOfPatrons();
        assertEquals(2, actual);

    }

//    @Test
//    public void testNumberOfPatrons() {
//        int actual = table.getNumberOfPatrons();
//        assertEquals(4, actual);
//    }
}
