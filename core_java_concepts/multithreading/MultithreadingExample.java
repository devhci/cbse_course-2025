package multithreading;
// Demonstrating Multithreading in Java
// This program shows how to create and start a thread.

class MyThread extends Thread {
    // Method executed when the thread starts
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        // Creating a new thread and starting it
        MyThread t1 = new MyThread();
        t1.start(); // Calls the run method
    }
}
