package dk.sdu.cbs.demo.service;


import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

//
//    @Override
//    public int divide(int a, int b) {
//        if (b == 0) {
//            throw new IllegalArgumentException("Division by zero is not allowed.");
//        }
//        return a / b;
//    }
}