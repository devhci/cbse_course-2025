package com.payment.core.api;

/**
 * PaymentProcessor interface defines the contract for processing payments.
 */
public interface PaymentProcessor {
    /**
     * Processes a payment for a given account.
     * @param accountId The ID of the account.
     * @param amount The payment amount.
     */
    void processPayment(String accountId, double amount);
}


