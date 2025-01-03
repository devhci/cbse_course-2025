package encapsulation;
// Demonstrating Encapsulation in Java
// This program uses private fields and public getter/setter methods to control access to data.

class Person {
    // Private field to restrict direct access
    private String name;

    // Public getter method to retrieve the value of name
    public String getName() {
        return name;
    }

    // Public setter method to modify the value of name
    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating an object of the encapsulation.Person class and using its getter and setter
        Person person = new Person();
        person.setName("Alice"); // Setting the name using the setter
        System.out.println("encapsulation.Person's name: " + person.getName()); // Accessing the name using the getter
    }
}
