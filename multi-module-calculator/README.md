# Multi-Module Calculator Project

This project demonstrates a **Component-Based Software Architecture** using a multi-module Maven setup. The application provides basic calculator functionalities by organizing the code into reusable components.

## Project Structure

```plaintext
multi-module-calculator/
├── pom.xml                   # Parent POM
├── components/
│   ├── calculator-core/      # Core logic for calculator operations
│   │   ├── pom.xml
│   │   └── src/main/java/com/example/calculatorcore/
│   ├── calculator-service/   # Service layer to expose calculator functionalities
│   │   ├── pom.xml
│   │   └── src/main/java/com/example/calculatorservice/
├── application/
│   ├── calculator-app/       # Application module (entry point)
│   │   ├── pom.xml
│   │   └── src/main/java/com/example/calculatorapp/
```

## Prerequisites

- **Java 17+**
- **Apache Maven 3.6+**

## Modules Overview

1. **calculator-core**:
   - Encapsulates the core domain logic (basic calculator operations like add, subtract).

2. **calculator-service**:
   - Provides services built on top of the core logic.
   - Acts as an intermediary to expose functionalities.

3. **calculator-app**:
   - The main application module that uses the service layer to perform operations.
   - Entry point for running the application.

## How to Build and Run the Project

### Step 1: Clone the Repository

```bash
git clone <repository_url>
cd multi-module-calculator
```

### Step 2: Build the Project

Execute the following command in the root directory:

```bash
mvn clean package
```

This will:
- Compile all modules.
- Create a **fat JAR** for the `calculator-app` module, which includes all dependencies.

### Step 3: Run the Application

Navigate to the `calculator-app` module:

```bash
cd application/calculator-app
```

Run the application using the `fat JAR`:

```bash
java -jar target/calculator-app-1.0-SNAPSHOT.jar
```

### Example Output

```plaintext
Addition: 8
Subtraction: 2
```

## Design Principles

1. **Component-Based Software Architecture**:
   - Each module is independent and encapsulates specific functionality.
   - Modules can be reused in other projects.

2. **Separation of Concerns**:
   - The `calculator-core` focuses on domain logic.
   - The `calculator-service` exposes a layer over the core for consumption.
   - The `calculator-app` acts as the consumer of services.

3. **Maintainability**:
   - Clear boundaries and dependencies make the project easy to maintain and extend.

## Troubleshooting

1. **Error: `NoClassDefFoundError`**:
   - Ensure you have built the project with `mvn clean package`.
   - Use the `fat JAR` created by the `maven-shade-plugin`.

2. **Error: `Missing Main-Class Attribute`**:
   - Ensure the `maven-shade-plugin` is configured in `calculator-app/pom.xml` with the correct `mainClass` property.
