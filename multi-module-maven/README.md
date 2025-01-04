# Multi-Module Maven Project

This project demonstrates a multi-module Maven structure. It includes:

1. **Calculator Service**: A basic service providing arithmetic operations.
2. **Parent Consumer**: Consumes the calculator service.

## Prerequisites

- Java 23.0.1
- Maven 3.9.9

## Steps to Run

1. **Clone the Repository**:
    ```bash
    git clone <repository-url>
    cd multi-module-maven
    ```

2. **Build the Project**:
    ```bash
    mvn clean install
    ```

3. **Run the Consumer Module**:
    Navigate to the `parent-consumer` directory and execute:
    ```bash
    mvn exec:java -Dexec.mainClass="com.example.parentconsumer.ConsumerApp"
    ```

4. **Output**:
    - The console will display results of arithmetic operations.

## Project Structure

- `multi-module-maven`: Parent POM
- `calculator-service`: Module providing calculator logic
- `parent-consumer`: Module consuming the calculator logic
