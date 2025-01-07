# JPMS Example: Payment System

This project demonstrates the Java Platform Module System (JPMS) with a payment system example.

## Modules

1. **com.payment.core**: Contains the core API and main application logic.
2. **com.payment.impl**: Provides the implementation for the `PaymentProcessor` service.
3. **com.payment.utils**: Contains utility classes shared across modules.

## How to Compile and Run

### Compile
```bash
javac -d out --module-source-path src $(find src -name "*.java")
```

### Run
```bash
java --module-path out --module com.payment.core/com.payment.core.Main
```

## Key Features

- **requires**: Explicitly declares dependencies between modules.
- **exports**: Exposes specific packages to other modules.
- **uses**: Declares a service dependency.
- **provides ... with**: Implements a service.

## Module Structure

- `com.payment.core`: Core logic and service usage.
- `com.payment.impl`: Service provider implementation.
- `com.payment.utils`: Utility functions.

