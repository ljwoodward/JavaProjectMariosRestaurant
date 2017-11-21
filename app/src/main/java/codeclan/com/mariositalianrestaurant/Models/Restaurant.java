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
    private Kitchen kitchen;


    public Restaurant(String name) {
        this.name = name;
        this.till = 0;
        this.tables = new ArrayList<>();
        this.menu = new LaCarte();
        this.kitchen = new Kitchen();
    }

    public Table newTable() {
        int tableNumber = this.getTables().size() + 1;
        String tableName = "Table " + Integer.toString(tableNumber);
        Table table = new Table(tableName);
        this.tables.add(table);
        return table;
    }

    public void addToTill(double amount) {
        this.till += amount;
    }

    public double getTill() {
        return this.till;
    }

    public ArrayList<Table> getTables() {
        return this.tables;
    }

    public String getTablesList() {
        int count = 1;
        String tableList = "";
        for(Table table : this.tables) {
            table.tableOrder();
            tableList += table.getOrderList() + "\n";
            count++;
        }
        return tableList;
    }


    public void clearTable(Table table) {
        table.tableOrder();
        double total = table.getTotalBill();
        this.till += total;
        this.tables.remove(table);
    }
}
