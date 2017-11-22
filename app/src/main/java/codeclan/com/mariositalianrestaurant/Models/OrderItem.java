package codeclan.com.mariositalianrestaurant.Models;

/**
 * Created by janemackay on 22/11/2017.
 */

abstract class OrderItem {

    private String name;
    private int portions;
    private double pricePerPortion;

    public OrderItem(String name, int portions, double pricePerPortion) {
        this.name = name;
        this.portions = portions;
        this.pricePerPortion = pricePerPortion;
    }

    public String getName() {
        return this.name;
    }

    public int getPortions() {
        return this.portions;
    }

    public void usePortionOfOrderItem() {
        this.portions--;
    }

    public double getTotalPrice() {
        double total = this.pricePerPortion * this.portions;
        double roundAmount =  Math.round(total * 100.0)/100.0;
        return roundAmount;
    }
}
