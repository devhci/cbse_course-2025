package generics;
// Demonstrating Generics in Java
// This program uses a generic ArrayList to store and iterate over elements of a specific type.

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        // Creating a generic ArrayList to store integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        // Iterating through the list and printing each element
        for (int number : list) {
            System.out.println(number);
        }
    }
}
