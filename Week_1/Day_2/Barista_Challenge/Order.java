package Week_1.Day_2.Barista_Challenge;

import java.util.ArrayList;

public class Order {
    // MEMBER VARIABLES
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // CONSTRUCTOR
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
        this.ready = false;
    }

    // OVERLOADED CONSTRUCTOR
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
        this.ready = false;
    }

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // ORDER METHODS
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.printf("Customer Name: %s\n", this.name);
        for (Item item : this.items) {
            System.out.printf("%s - $%.2f\n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%.2f\n", this.getOrderTotal());
    }
}
