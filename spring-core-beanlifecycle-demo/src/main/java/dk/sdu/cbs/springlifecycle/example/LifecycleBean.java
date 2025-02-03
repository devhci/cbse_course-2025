package dk.sdu.cbs.springlifecycle.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * A class to demonstrate the full Spring Bean Lifecycle.
 */


public class LifecycleBean {

    public LifecycleBean() {
        System.out.println("Constructor: Bean is being created.");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct: Bean has been created and dependencies are set.");
    }

    public void useBean() {
        System.out.println("Using Bean: Performing some operation.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy: Bean is about to be destroyed.");
    }
}
