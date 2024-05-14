public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("latte", 4.00);
        Item item4 = new Item("cappuccino", 4.50);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order4.addItem(item2);

        order1.markReady();
        order2.markReady();

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.err.println("-----------------------------");
        
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.err.println("-----------------------------");
        
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
    }
}
