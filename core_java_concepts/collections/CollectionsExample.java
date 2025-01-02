package collections;
// Demonstrating the Collections Framework in Java
// This program uses an ArrayList to store and iterate over a list of elements.

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {


        // Creating an ArrayList to store string elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Iterating through the list and printing each element
        for (String language : list) {
            System.out.println(language);
        }

        System.out.println("\n *********Creating a HashSet**********\n");
        // Creating a HashSet
        HashSet<String> cities = new HashSet<>();

        // Adding elements
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("New York"); // Duplicate, won't be added

        // Iterating through the set
        System.out.println("Unique cities:");
        for (String city : cities) {
            System.out.println(city);
        }



       System.out.println("\n *********Creating a PriorityQueue**********\n");
        // Creating a PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Adding elements
        queue.add(30);
        queue.add(10);
        queue.add(20);

        // Polling elements (removes the smallest element first)
        System.out.println("Removed: " + queue.poll());
        System.out.println("Peek: " + queue.peek());

        // Displaying remaining elements
        System.out.println("Queue: " + queue);


        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        // Accessing elements
        System.out.println("Value for key 2: " + map.get(2));

        // Iterating through the map
        System.out.println("All entries:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Removing an entry
        map.remove(2);
        System.out.println("After removal: " + map);

    }
}
