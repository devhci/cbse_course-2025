package dk.sdu.cbs.springlifecycle.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class to demonstrate Spring Container Lifecycle.
 */
public class App {
    public static void main(String[] args) {
        // Load the Spring context from XML configuration
        ConfigurableApplicationContext context;
        try {
            context = new ClassPathXmlApplicationContext("beans.xml");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Retrieve bean from the context
        LifecycleBean lifecycleBean = (LifecycleBean) context.getBean("lifecycleBean");

        // Simulate usage
        lifecycleBean.useBean();

        // Close the context to trigger destroy method
        context.close();
    }
}
