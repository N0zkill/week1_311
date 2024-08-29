package org.example;

// Car.java
public class Car extends Vehicle {
    // Add attribute
    private String brand;

    // Constructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Methods
    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Brand: " + getBrand());
    }
}
