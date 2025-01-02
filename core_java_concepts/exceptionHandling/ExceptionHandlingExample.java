package exceptionHandling;
// Demonstrating Exception Handling in Java
// This program shows how to handle runtime errors using try-catch-finally blocks.

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0; // Division by zero will throw ArithmeticException
        } catch (ArithmeticException e) {
            // Catch block to handle the exception
            System.out.println("Exception caught: Division by zero.");
        } finally {
            // Code that will always execute
            System.out.println("Finally block executed.");
        }
    }
}
