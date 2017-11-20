package codeclan.com.mariositalianrestaurant.Models;

import android.view.MenuItem;

import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

class Table {

    protected ArrayList<Patron> patrons;
    private ArrayList<LaCarteItem> order;
    private Restaurant restaurant;
    private String name;

    public Table(Restaurant restaurant) {
        this.patrons = new ArrayList<Patron>();
        this.order = new ArrayList<LaCarteItem>();
        this.restaurant = restaurant;

        int tableNumber = this.restaurant.getTables().size();
        String tableName = "Table " + Integer.toString(tableNumber);
        this.name = tableName;
    }


//    public Table(int numberOfPatrons) {
//
//        this.patrons = new ArrayList<Patron>();
//        this.order = new ArrayList<LaCarteItem>();
//        this.numberOfPatrons = numberOfPatrons;
//
//        for(int number = 1; number < numberOfPatrons + 1; number++) {
//            String designator = Integer.toString(number);
//            Patron patron = new Patron("patron" + designator);
//            this.addPatronToTable(patron);
//        }
//
//}
    public void addPatronToTable(Patron patron) {
        this.patrons.add(patron);
        patron.setTable(this);
    }

    public void addToTableOrder(LaCarteItem menuItem) {
        this.order.add(menuItem);
    }

    public String getOrderList() {
        String orderString = this.getName() + ":\n";

        for(LaCarteItem menuItem : this.order) {
            orderString += menuItem.getName() + "\n";
        }
        return orderString;
    }

    public int getNumberOfPatrons() {
        return patrons.size();
    }

    public String getName() {
        return name;
    }

    public double getTotalBill() {
        double total = 0;
        for (LaCarteItem menuItem : this.order) {
            double amount = menuItem.getPrice();
            total += amount;
        }
        return total;
    }


    public double splitBillEqually() {
        double total = this.getTotalBill() / this.getNumberOfPatrons();
        String string = Double.toString(total);
        String anotherString = string.substring(0, 4);
        Double splitAmount = Double.parseDouble(anotherString);
        splitAmount += 0.01;
        return splitAmount;
    }


}
