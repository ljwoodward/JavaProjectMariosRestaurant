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
    private int maxCapacity;

    public Restaurant(String name, LaCarte menu, int maxCapacity) {
        this.name = name;
        this.till = 0;
        this.tables = new ArrayList<>();
        this.menu = menu;
        this.maxCapacity = maxCapacity;
    }

    public void newTable(Table table) {
        this.tables.add(table);
    }



}
