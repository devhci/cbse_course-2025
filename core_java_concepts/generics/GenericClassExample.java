package generics;
// A generic class that can hold any type of data
class Box<T> {
    private T item;

    // Setter method
    public void setItem(T item) {
        this.item = item;
    }

    // Getter method
    public T getItem() {
        return item;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        // Creating a Box for integers
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Integer Box contains: " + intBox.getItem());

        // Creating a Box for strings
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println("String Box contains: " + stringBox.getItem());
    }
}