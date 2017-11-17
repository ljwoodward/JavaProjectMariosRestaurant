package codeclan.com.mariositalianrestaurant.Models;

import android.view.MenuItem;

import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

class Table {

    protected ArrayList<Patron> patrons;
    private ArrayList<LaCarteItem> order;

    public Table(int numberOfPatrons) {

        int number = 0;
        while (number < numberOfPatrons) {
            String designator = Integer.toString(number);
            Patron patron = new Patron("patron" + designator);
            this.patrons.add(patron);
            number += 1;
        }

    }

    public Table() {
        this.patrons = new ArrayList<Patron>();
        this.order = new ArrayList<LaCarteItem>();
    }

    public ArrayList<LaCarteItem> getOrder() {
        return order;
    }

    public int getNumberOfPatrons() {
        return patrons.size();
    }

    public void addPatronToTable(Patron patron) {
        this.patrons.add(patron);
    }



}
