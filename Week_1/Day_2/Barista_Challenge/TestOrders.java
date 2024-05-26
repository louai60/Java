package Week_1.Day_2.Barista_Challenge;

public class TestOrders {
    public static void main(String[] args) {

        // Create items
        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("latte", 4.00);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("cappuccino", 4.50);

        // Create orders
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Jimmy");
        Order order4 = new Order("Noah");
        Order order5 = new Order("Sam");

        // Add items to orders
        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item4);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item2);
        order5.addItem(item3);

        // Test getStatusMessage method
        order1.setReady(true);
        order3.setReady(true);

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());

        // Test getOrderTotal method
        System.out.printf("Order 1 Total: $%.2f\n", order1.getOrderTotal());
        System.out.printf("Order 2 Total: $%.2f\n", order2.getOrderTotal());
        System.out.printf("Order 3 Total: $%.2f\n", order3.getOrderTotal());
        System.out.printf("Order 4 Total: $%.2f\n", order4.getOrderTotal());
        System.out.printf("Order 5 Total: $%.2f\n", order5.getOrderTotal());

        // Test display method
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
