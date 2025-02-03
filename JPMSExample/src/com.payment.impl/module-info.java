module com.payment.impl {
    requires com.payment.core;
    provides com.payment.core.api.PaymentProcessor with com.payment.impl.StandardPaymentProcessor;
}
