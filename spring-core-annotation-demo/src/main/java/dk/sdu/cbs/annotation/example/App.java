package dk.sdu.cbs.annotation.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            // Check if the bean is created
            MyService myService = context.getBean(MyService.class);
            if (myService != null) {
                System.out.println("Bean has been created successfully.");
                myService.performService();
            } else {
                System.out.println("Bean creation failed.");
            }

        }
    }
}