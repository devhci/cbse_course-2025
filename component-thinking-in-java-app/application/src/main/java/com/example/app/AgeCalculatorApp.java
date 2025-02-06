package com.example.app;

import com.example.component.AgeCalculator;
import com.example.component.CalculatorIfce;
import com.example.framework.ComponentFramework;
import com.example.framework.ComponentRegistry;


import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculatorApp {
    public static void main(String[] args) {
        // Ensure framework initializes and registers components
        ComponentFramework.main(null);

        // Fetch AgeCalculator from registry
        CalculatorIfce calculator1 = (CalculatorIfce) ComponentRegistry.fetchComponent(CalculatorIfce.class);

        if (calculator1 == null) {
            System.out.println("No calculator found. Ensure the component is registered.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        int year = scanner.nextInt();
        Calendar dob = Calendar.getInstance();
        dob.set(Calendar.YEAR, year);

        int age = calculator1.calculateAge(dob);
        System.out.println("Your age is: " + age);
    }
}