package com.payment.utils;

/**
 * Utility class provides helper methods for the payment system.
 */
public class Utils {
    /**
     * Validates the payment amount.
     * @param amount The payment amount.
     * @return True if the amount is valid, otherwise false.
     */
    public static boolean validateAmount(double amount) {
        return amount > 0;
    }
}
