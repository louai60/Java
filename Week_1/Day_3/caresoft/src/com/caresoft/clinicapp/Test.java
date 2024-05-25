package com.caresoft.clinicapp;

public class Test {
    public static void main(String[] args) {
        // Create instances of Physician and AdminUser
        Physician doctor10 = new Physician(1);
        AdminUser roseTyler = new AdminUser(2, null, "Companion");
        AdminUser donnaNoble = new AdminUser(3, null, "Companion");

        // Physician Implementation Tests
        System.out.println("\n========== Physician Tests ==========\n");
        String pinTest1 = doctor10.assignPin(42)? "FAIL" : "PASS"; // Test assigning pin
        System.out.printf("Physician pin assign test 1: %s\n", pinTest1);
        
        String pinTest2 = doctor10.assignPin(4000)? "PASS" : "FAIL"; // Test assigning pin
        System.out.printf("Physician pin assign test 2: %s\n", pinTest2);
        
        String authTest1 = doctor10.accessAuthorized(1234)? "FAIL" : "PASS"; // Test access authorization
        System.out.printf("Physician auth test 1: %s\n", authTest1);
        
        String authTest2 = doctor10.accessAuthorized(1)? "PASS" : "FAIL"; // Test access authorization
        System.out.printf("Physician auth test 2: %s\n", authTest2);
        
        // AdminUser Implementation Tests
        System.out.println("\n========== AdminUser Tests ==========\n");
        String pinTest3 = roseTyler.assignPin(42)? "FAIL" : "PASS"; // Test assigning pin
        System.out.printf("Admin pin assign test 1: %s\n", pinTest3);
        
        String pinTest4 = roseTyler.assignPin(424242)? "PASS" : "FAIL"; // Test assigning pin
        System.out.printf("Admin pin assign test 2: %s\n", pinTest4);
        
        String authTest3 = roseTyler.accessAuthorized(1234)? "FAIL" : "PASS"; // Test access authorization
        System.out.printf("Admin auth test 1: %s\n", authTest3);
        
        String authTest4 = roseTyler.accessAuthorized(1234)? "FAIL" : "PASS"; // Test access authorization
        System.out.printf("Admin auth test 1: %s\n", authTest4);
        
        String authTest5 = roseTyler.accessAuthorized(2)? "PASS" : "FAIL"; // Test access authorization
        System.out.printf("Admin auth test 2: %s\n\n", authTest5);
        
        donnaNoble.accessAuthorized(42); // Testing access authorization
        donnaNoble.accessAuthorized(4321); // Testing access authorization
        donnaNoble.accessAuthorized(7); // Testing access authorization
        donnaNoble.accessAuthorized(28); // Testing access authorization
        
        System.out.println(donnaNoble.getSecurityIncidents()); // Print security incidents
    }
}
