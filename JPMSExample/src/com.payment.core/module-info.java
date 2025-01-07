module com.payment.core {
    requires com.payment.utils;
    exports com.payment.core.api;
    uses com.payment.core.api.PaymentProcessor;
}
