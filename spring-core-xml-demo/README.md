# Spring Core XML Configuration Demo

## Introduction

This is a simple Spring Maven project demonstrating Dependency Injection (DI) using **Spring Core** with an **XML-based configuration**.

## Project Structure

```
spring-core-xml-demo/
│── src/main/java/dk/sdu/cbs/example
│   ├── App.java         # Main class loading Spring context
│   ├── HelloWorld.java  # Bean class with setter method
│── src/main/resources/
│   ├── beans.xml        # XML configuration file defining beans
│── pom.xml              # Maven configuration file with Spring dependency
│── README.md            # Documentation
```

## Understanding Spring Dependency Injection (DI)

Spring DI is a fundamental feature of Spring Core that allows injecting dependencies into objects automatically, removing the need for manual instantiation and management.

### XML-Based Configuration

In this project, we use **XML configuration** to define a simple Spring bean:

```xml

<bean id="helloWorldBean" class="dk.sdu.cbs.example.HelloWorld">
    <property name="message" value="Spring XML Configuration"/>
</bean>
```

This instructs Spring to create an instance of `HelloWorld` and inject the `"Spring XML Configuration"` value into its `message` property.

## Running the Application

1. Clone or unzip the project.
2. Navigate to the project directory and run:

   ```sh
   mvn compile exec:java -Dexec.mainClass="dk.sdu.cbs.example.App"
   ```

## Expected Output

```
Hello, Spring XML Configuration
```

This confirms that Spring successfully created and injected the bean using XML configuration.

## Conclusion

This project provides a minimal example of how to use Spring Core's Dependency Injection with an XML-based configuration. You can extend it by adding more beans and exploring different DI techniques (constructor-based injection, annotations, etc.).
