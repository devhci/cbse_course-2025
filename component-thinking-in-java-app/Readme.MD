# Component Thinking  in Java

## Overview

The project follows a **modular architecture** where components can be developed and assembled independently.

## Features
- **Decoupled Components**: Components communicate through interfaces instead of direct dependencies.
- **Component Registry**: A framework that registers and retrieves components dynamically at runtime.
- **Maven Multi-Module Project**: Organized into separate modules for better maintainability.
- **Loose Coupling via Interfaces**: Implementation classes depend on interfaces, not concrete classes.
- **Runtime Component Assembly**: Uses a registry to fetch and inject dependencies dynamically.

## Project Structure
```
component-based-app
│── pom.xml (Parent POM)
│
├── component-interface
│   ├── src/main/java/com/example/component/CalculatorIfce.java
│   └── pom.xml
│
├── age-calculator
│   ├── src/main/java/com/example/component/AgeCalculator.java
│   └── pom.xml
│
├── component-framework
│   ├── src/main/java/com/example/framework/ComponentRegistry.java
│   ├── src/main/java/com/example/framework/ComponentFramework.java
│   └── pom.xml
│
├── application
│   ├── src/main/java/com/example/app/AgeCalculatorApp.java
│   └── pom.xml
```

## Module Breakdown
### 1. **component-interface**
Defines an interface for the age calculator component.

**File:** `CalculatorIfce.java`
```java
package com.example.component;
import java.util.Calendar;
public interface CalculatorIfce {
    int calculateAge(Calendar dateOfBirth);
}
```

### 2. **age-calculator**
Implements the age calculation logic using the interface.

**File:** `AgeCalculator.java`
```java
package com.example.component;
import java.util.Calendar;
public class AgeCalculator implements CalculatorIfce {
    @Override
    public int calculateAge(Calendar dateOfBirth) {
        int birthYear = dateOfBirth.get(Calendar.YEAR);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }
}
```

### 3. **component-framework**
Provides a registry that stores and retrieves components dynamically.

**File:** `ComponentRegistry.java`
```java
package com.example.framework;
import java.util.HashMap;
import java.util.Map;
public class ComponentRegistry {
    private static final Map<Class<?>, Object> components = new HashMap<>();
    public static void registerComponent(Class<?> interfaceClass, Object instance) {
        components.put(interfaceClass, instance);
    }
    public static Object fetchComponent(Class<?> interfaceClass) {
        return components.get(interfaceClass);
    }
}
```

### 4. **application**
The main application that interacts with the registered component.

**File:** `AgeCalculatorApp.java`
```java
package com.example.app;
import com.example.component.CalculatorIfce;
import com.example.framework.ComponentRegistry;
import java.util.Calendar;
import java.util.Scanner;
public class AgeCalculatorApp {
    public static void main(String[] args) {
        CalculatorIfce calculator = (CalculatorIfce) ComponentRegistry.fetchComponent(CalculatorIfce.class);
        if (calculator == null) {
            System.out.println("No calculator found. Ensure the component is registered.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        int year = scanner.nextInt();
        Calendar dob = Calendar.getInstance();
        dob.set(Calendar.YEAR, year);
        int age = calculator.calculateAge(dob);
        System.out.println("Your age is: " + age);
    }
}
```

## How to Run the Project
### Prerequisites
- Install **Java 8+**
- Install **Maven**

### Build and Run
1. **Clone the repository**
   ```sh
   git clone <repository-url>
   cd component-based-app
   ```

2. **Build the project**
   ```sh
   mvn clean install
   ```

3. **Register the component** (Manual step for testing, in real-world usage this is automated)
   ```java
   ComponentRegistry.registerComponent(CalculatorIfce.class, new AgeCalculator());
   ```

4. **Run the application**
   ```sh
   mvn -pl application exec:java -Dexec.mainClass="com.example.app.AgeCalculatorApp"
   ```

## Benefits of This Approach
- **Independent Development**: Components can be developed, tested, and maintained separately.
- **Easy Scalability**: New components can be registered without modifying existing code.
- **Reusability**: Components can be reused across multiple applications.
- **Loose Coupling**: Reduces dependencies, making the system more modular.

## Future Enhancements
- Automate component registration using a dependency injection framework like Spring.
- Implement more business components following the same architecture.
- Extend the component model to handle multiple services.
