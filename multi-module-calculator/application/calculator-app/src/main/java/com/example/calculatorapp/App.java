package com.example.calculatorapp;

import com.example.calculatorservice.CalculatorService;

public class App {
    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();
        System.out.println("Addition: " + service.add(5, 3));
        System.out.println("Subtraction: " + service.subtract(5, 3));
    }
}
