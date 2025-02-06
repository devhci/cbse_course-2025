package com.example.framework;

import com.example.component.AgeCalculator;
import com.example.component.CalculatorIfce;

public class ComponentFramework {
    public static void main(String[] args) {
        // Register AgeCalculator in ComponentRegistry
        ComponentRegistry.registerComponent(CalculatorIfce.class, new AgeCalculator());

        // Verify registration
        CalculatorIfce calculator = (CalculatorIfce) ComponentRegistry.fetchComponent(CalculatorIfce.class);
        if (calculator == null) {
            System.out.println("Registration failed!");
        } else {
            System.out.println("AgeCalculator successfully registered.");
        }
    }
}