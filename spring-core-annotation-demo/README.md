# Spring Core Annotation-Based Configuration Demo

## Introduction

This project demonstrates a **Spring Core** application using **Annotation-Based Configuration**.

## Project Structure

```
spring-core-annotation-demo/
│── src/main/java/com/example/
│   ├── App.java         # Main class managing Spring context
│   ├── AppConfig.java   # Configuration class replacing XML config
│   ├── MyService.java   # A simple service class
│── pom.xml              # Maven configuration file with Spring dependency
│── README.md            # Documentation
```

## Spring Annotation-Based Configuration

Spring allows us to define beans and configurations using Java annotations instead of XML.

### Key Annotations Used

1. **`@Configuration`** - Marks a class as a Spring configuration class.
2. **`@ComponentScan`** - Instructs Spring to scan for components in the specified package.
3. **`@Service`** - Marks a class as a Spring service component.

## Java-Based Configuration

Instead of XML, we use `AppConfig.java` to define Spring beans:

```java
@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
}
```

This tells Spring to **scan the package** and automatically register annotated components.

## Running the Application

1. Clone or unzip the project.
2. Navigate to the project directory and run:

   ```sh
   mvn compile exec:java -Dexec.mainClass="dk.sdu.cbs.annotation.example.App"
   ```

## Expected Output

```
Service is being executed.
```

## Conclusion

This example provides a minimal demonstration of **Annotation-Based Configuration in Spring**, showing how to define and consume services using annotations instead of XML.
