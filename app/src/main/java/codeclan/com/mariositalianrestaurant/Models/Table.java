package codeclan.com.mariositalianrestaurant.Models;

import android.view.MenuItem;

import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

class Table {

    protected ArrayList<Patron> patrons;
    private ArrayList<LaCarteItem> order;
    private int numberOfPatrons;

    public Table() {
        this.patrons = new ArrayList<Patron>();
        this.order = new ArrayList<LaCarteItem>();
        this.numberOfPatrons = 0;
    }

    public void addPatronToTable(Patron patron) {
        this.patrons.add(patron);
    }

    public Table(int numberOfPatrons) {

        this.patrons = new ArrayList<Patron>();
        this.order = new ArrayList<LaCarteItem>();
        this.numberOfPatrons = numberOfPatrons;

        for(int number = 1; number < numberOfPatrons + 1; number++) {
            String designator = Integer.toString(number);
            Patron patron = new Patron("patron" + designator);
            this.addPatronToTable(patron);
        }



    }

    public ArrayList<LaCarteItem> getOrder() {
        return order;
    }

    public int getNumberOfPatrons() {
        return patrons.size();
    }



}
