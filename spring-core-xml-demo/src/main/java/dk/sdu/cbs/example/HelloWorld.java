package dk.sdu.cbs.example;

/**
 * A simple class to demonstrate Spring Bean creation using XML.
 */
public class HelloWorld {
    private String message;

    // Setter method for dependency injection
    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println("Hello, " + message);
    }



    public void initMethod() throws Exception
    {
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm "
                        + "the init() method");
    }

    // This method executes
    // when the spring container
    // is closed

    public void destroy() throws Exception {
        System.out.println("Bean will destroy now.");
    }


}
