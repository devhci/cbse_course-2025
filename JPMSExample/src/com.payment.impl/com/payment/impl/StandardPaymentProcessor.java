package com.payment.impl;

import com.payment.core.api.PaymentProcessor;

/**
 * StandardPaymentProcessor provides the default implementation for PaymentProcessor.
 */
public class StandardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(String accountId, double amount) {
        System.out.println("Processing payment for account: " + accountId + " Amount: " + amount);
    }
}
