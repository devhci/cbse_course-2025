package dk.sdu.cbs.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Main class to demonstrate Spring Core Bean creation using XML configuration.
 */
public class App {
    public static void main(String[] args) {
        // Load the Spring context from XML configuration
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // Retrieve bean from the context
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorldBean");

       // HelloWorld helloWorldBeanWithScopeandInitDestroy = (HelloWorld) context.getBean("helloWorldBeanWithScopeandInitDestroy");

//        // Load the Spring context from XML configuration using BeanFactory
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        // Retrieve bean from the factory
//        HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorldBean");


        // Call method on the bean
        helloWorld.sayHello();

        //helloWorldBeanWithScopeandInitDestroy.sayHello();

        // Close the context
        context.close();
    }
}
