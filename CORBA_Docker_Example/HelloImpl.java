import HelloApp.HelloPOA;

public class HelloImpl extends HelloPOA {
    @Override
    public String sayHello() {
        return "Hello component based systems class, CORBA in Docker says Hi!";
    }
}
