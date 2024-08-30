package org.example;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a Car
        Car myCar = new Car(4, "Red", 2.0f, "Petrol", "Toyota");

        //display all actions 
        myCar.honk();


        myCar.displayInfo();

        myCar.setColor("Blue");
        myCar.setBrand("Honda");


        System.out.println("\nUpdated Car Information:");
        myCar.displayInfo();
    }
}
