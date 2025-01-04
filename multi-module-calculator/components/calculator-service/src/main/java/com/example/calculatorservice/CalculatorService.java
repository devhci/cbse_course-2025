package com.example.calculatorservice;

import com.example.calculatorcore.Calculator;

public class CalculatorService {
    private final Calculator calculator = new Calculator();

    public int add(int a, int b) {
        return calculator.add(a, b);
    }

    public int subtract(int a, int b) {
        return calculator.subtract(a, b);
    }
}
