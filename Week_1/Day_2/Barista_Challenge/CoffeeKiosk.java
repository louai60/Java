package Week_1.Day_2.Barista_Challenge;

import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Constructor
    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    // Method to add a menu item
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size()); // Set the index to the current size of the menu
        menu.add(newItem);
    }

    // Method to display the menu
    public void displayMenu() {
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    // Method to create a new order
    public void newOrder() {
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        // Create a new order with the given input string
        Order newOrder = new Order(name);
        
        // Show the user the menu, so they can choose items to add.
        displayMenu();
        
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while (!itemNumber.equals("q")) {
            try {
                int index = Integer.parseInt(itemNumber);
                if (index >= 0 && index < menu.size()) {
                    Item orderedItem = menu.get(index);
                    newOrder.addItem(orderedItem);
                    System.out.println("Added: " + orderedItem.getName());
                } else {
                    System.out.println("Invalid index. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid item index.");
            }

            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        
        // After you have collected their order, print the order details
        newOrder.display();
        orders.add(newOrder);
    }

    // Ninja Bonus: Method to add menu item by user input
    public void addMenuItemByInput() {
        System.out.println("Please enter the name of the new menu item:");
        String name = System.console().readLine();

        System.out.println("Please enter the price of the new menu item:");
        double price = Double.parseDouble(System.console().readLine());

        addMenuItem(name, price);
    }
}
