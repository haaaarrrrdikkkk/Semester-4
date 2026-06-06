package Threads;
// Normal: Create a new class for our thread

// Technical: Class inherits Thread class to acquire threading capabilities

class NumberThread extends Thread {

    // Normal: This method contains the work the thread will perform
    // Technical: run() is the entry point of a thread's execution

    public void run() {

        // Normal: Print numbers from 1 to 5
        // Technical: Iterative execution inside thread context

        for (int i = 1; i <= 5; i++) {

            System.out.println(i);

        }
    }
}

public class Main {

    public static void main(String[] args) {

        // Normal: Create a thread object
        // Technical: Instantiate NumberThread class

        NumberThread obj = new NumberThread();

        // Normal: Start the thread
        // Technical: JVM creates a new call stack and invokes run()

        obj.start();

        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println(ch);

        }
    }
}