package codeclan.com.mariositalianrestaurant.Models;

import android.view.Menu;

import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

public class Restaurant {

    private String name;
    private double till;
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

    public void addToTill(double amount) {
        this.till += amount;
    }

    public String getTables() {
        int count = 1;
        String tableList = "";
        for(Table table : this.tables) {
            tableList += "Table " + Integer.toString(count) + ":\n";
            tableList += table.getOrder() + "\n\n";
            count++;
        }
    }




}
