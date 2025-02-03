package dk.sdu.cbs.annotation.example;


import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Service
public class MyServiceImpl implements MyService {

    @Override
    public void performService() {
        System.out.println("Performing service...");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct: MyServiceImpl bean has been created and dependencies are set.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy: MyServiceImpl bean is about to be destroyed.");
    }

}
