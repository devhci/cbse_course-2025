package com.payment.core;

import com.payment.core.api.PaymentProcessor;

import java.util.ServiceLoader;

/**
 * Main application class for the payment system.
 */
public class Main {
    public static void main(String[] args) {
        // Load PaymentProcessor service using ServiceLoader
        ServiceLoader<PaymentProcessor> loader = ServiceLoader.load(PaymentProcessor.class);

        // Iterate through available providers and process payment
        for (PaymentProcessor processor : loader) {
            processor.processPayment("123456789", 250.75);
        }
    }
}
