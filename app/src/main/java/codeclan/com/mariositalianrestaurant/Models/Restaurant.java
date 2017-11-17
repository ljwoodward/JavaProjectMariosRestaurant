package codeclan.com.mariositalianrestaurant.Models;

import android.view.Menu;

import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

public class Restaurant {

    private String name;
    private float till;
    private ArrayList<Table> tables;
    private LaCarte menu;


    public Restaurant(String name, LaCarte menu) {
        this.name = name;
        this.till = 0;
        this.tables = new ArrayList<>();
        this.menu = menu;
    }

    public void newTable(Table table) {
        this.tables.add(table);
    }

    public float getTill() {
        return till;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }




}
