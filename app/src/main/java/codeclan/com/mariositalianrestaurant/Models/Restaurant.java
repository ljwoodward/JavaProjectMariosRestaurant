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
    protected Kitchen kitchen;
    private ArrayList<StockOrder> pendingOrders;
    private ArrayList<OrderItem> nextOrder;
    private OrderList orderList;


    public Restaurant(String name) {
        this.name = name;
        this.till = 0;
        this.tables = new ArrayList<>();
        this.menu = new LaCarte();
        this.kitchen = new Kitchen();
        this.pendingOrders = new ArrayList<>();
        this.orderList = new OrderList();
        this.nextOrder = new ArrayList<>();
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
        String tableList = "";
        for(Table table : this.tables) {
            table.tableOrder();
            tableList += table.getOrderList() + "\n";
        }
        return tableList;
    }

    public void clearTable(Table table) {
        table.tableOrder();
        double total = table.getTotalBill();
        this.till += total;
        this.tables.remove(table);
    }

    public void addPendingDelivery(StockOrder stockOrder) {
        this.pendingOrders.add(stockOrder);
    }

    public ArrayList<StockOrder> getPendingOrders() {
        return this.pendingOrders;
    }

    public String addToNextOrder(String name, int portions) {
        if (this.orderList.ingredientList.containsKey(name)) {
            double priceOfItem = this.orderList.ingredientList.get(name);
            Ingredient ingredient = new Ingredient(name, portions, priceOfItem);
            this.nextOrder.add(ingredient);
            return "Added to order";
        } else {
            return "Not on list";
        }
    }

    public ArrayList<OrderItem> getNextOrder() {
        return nextOrder;
    }


    public void makeOrder() {
        StockOrder stockOrder = new StockOrder();
        for(OrderItem item : this.nextOrder) {
            stockOrder.addToOrder(item);
        }
        this.pendingOrders.add(stockOrder);
        double price = stockOrder.getTotalPrice();
        this.till -= price;
    }

    public void sendOrderToKitchen(Table table) {
        ArrayList<LaCarteItem> order = table.tableOrder();
        this.kitchen.addOrder(order);
    }
}
