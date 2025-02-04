package dk.sdu.cbs.demo;



import dk.sdu.cbs.demo.service.ArithmeticCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        // Load Spring context from the configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the ArithmeticCalculator bean
        ArithmeticCalculator calculator = context.getBean(ArithmeticCalculator.class);

        // Call the add method and print the result
        System.out.println("Result: " + calculator.add(10, 20));
    }
}