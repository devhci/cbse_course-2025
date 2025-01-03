package oopprinciples;
// Demonstrating Object-Oriented Programming (OOP) principles in Java
// This example shows encapsulation, constructors, and methods.

class Car {
    // Fields to represent car properties
    String model;
    int year;

    // Constructor to initialize car properties
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class OOPPrinciples {
    public static void main(String[] args) {
        // Creating an object of the oopprinciples.Car class and calling its method
        Car car1 = new Car("Toyota", 2020);
        car1.displayDetails();
    }
}
