package codeclan.com.mariositalianrestaurant.Models;

import android.view.MenuItem;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

class Table {

    protected ArrayList<Patron> patrons;
    private ArrayList<LaCarteItem> order;
    private String name;

    public Table(String name) {
        this.patrons = new ArrayList<>();
        this.order = new ArrayList<>();
        this.name = name;
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

    public void tableOrder() {
        for(Patron patron : this.patrons) {
            for (LaCarteItem menuItem : patron.getOrder()) {
                this.order.add(menuItem);
            }
        }
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
        double splitAmount =  Math.round(total * 100.0)/100.0;
        splitAmount += 0.01;
        return splitAmount;
    }




}
