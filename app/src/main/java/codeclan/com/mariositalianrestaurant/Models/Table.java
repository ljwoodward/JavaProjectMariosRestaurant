package codeclan.com.mariositalianrestaurant.Models;

import android.view.MenuItem;

import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

class Table {

    private ArrayList<Patron> patrons;
    private ArrayList<LaCarteItem> order;

    public Table() {
        this.patrons = new ArrayList<Patron>();
        this.order = new ArrayList<LaCarteItem>();
    }


}
