package codeclan.com.mariositalianrestaurant.Models;

import java.util.ArrayList;

/**
 * Created by janemackay on 17/11/2017.
 */

class Patron {

    private String name;
    private ArrayList<LaCarteItem> order;
    private Restaurant restaurant;
    private Table table;


    public Patron(String name, Restaurant restaurant) {
        this.name = name;
        this.order = new ArrayList<LaCarteItem>();
        this.restaurant = restaurant;
        this.table = null;
    }

    public void setTable(Table table) {
        this.table = table;
    }


    public String getName() {
        return name;
    }

    public ArrayList getOrder() {
         return order;
    }

//    public Table thisTable(){
//         for(Table table : restaurant.getTables()){
//             table.patrons.contains(this);
//
//         }
//        return table;
//
//    }


    public void orderFromMenu(LaCarteItem item) {
         this.order.add(item);
         this.table.addToTableOrder(item);
    }

    public String getOrderList() {
         String orderList = "";
         for(LaCarteItem menuItem : this.order) {
             orderList += menuItem.getName() + "\n";
         }
         return orderList;
    }

}
