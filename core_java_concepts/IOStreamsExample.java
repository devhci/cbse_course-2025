
// Demonstrating Input and Output Streams in Java
// This program writes data to a file and reads it back.

import java.io.*;

public class IOStreamsExample {
    public static void main(String[] args) {
        try {
            // Writing data to a file
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            writer.close();

            // Reading data from the file
            FileReader reader = new FileReader("output.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();
        } catch (IOException e) {
            // Handling I/O exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
