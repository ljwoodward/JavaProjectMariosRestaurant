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
    private double bill;


    public Table(String name) {
        this.patrons = new ArrayList<>();
        this.order = new ArrayList<>();
        this.name = name;
        this.bill = 0;
    }


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

    public ArrayList<LaCarteItem> tableOrder() {
        for(Patron patron : this.patrons) {
            for (LaCarteItem menuItem : patron.getOrder()) {
                this.order.add(menuItem);
            }
        }
        return this.order;
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


    public String splitBillByPatron() {
        String splitBill = "";
        for (Patron patron : this.patrons) {
            splitBill += patron.getName() + ": " + Double.toString(patron.getCostOfOrder()) + "\n";
        }
        return splitBill;
    }

    public Patron newPatron() {
        int patronNumber = this.patrons.size() +1;
        String patronName = this.name + ", Patron " + Integer.toString(patronNumber);
        Patron patron = new Patron(patronName);
        this.patrons.add(patron);
        return patron;
    }
}
