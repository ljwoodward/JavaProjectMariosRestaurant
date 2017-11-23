package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

class Table {

    protected ArrayList<Patron> patrons;
    private ArrayList<Dish> foodOrder;
    private String name;
    private double bill;


    public Table(String name) {
        this.patrons = new ArrayList<>();
        this.foodOrder = new ArrayList<>();
        this.name = name;
        this.bill = 0;
    }


     public void addPatronToTable(Patron patron) {
        this.patrons.add(patron);
    }

     public String getOrderList() {
        String orderString = this.getName() + ":\n";

        for(Dish dish : this.foodOrder) {
            orderString += dish.getName() + "\n";
        }
        return orderString;
    }

    public int getNumberOfPatrons() {
        return patrons.size();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Dish> tableOrder() {
        for(Patron patron : this.patrons) {
            for (Dish dish : patron.getOrder()) {
                this.foodOrder.add(dish);
            }
        }
        return this.foodOrder;
    }

    public double getTotalBill() {
        double total = 0;
        for (Dish dish : this.foodOrder) {
            double amount = dish.getPrice();
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
