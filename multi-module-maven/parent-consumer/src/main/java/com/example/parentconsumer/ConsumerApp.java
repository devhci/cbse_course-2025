package com.example.parentconsumer;

import com.example.calculatorservice.CalculatorService;

public class ConsumerApp {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorService();

        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));
    }
}
