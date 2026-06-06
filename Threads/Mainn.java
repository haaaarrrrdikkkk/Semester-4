package Threads;

class AlphabetThreads extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'F'; ch++) {
            System.out.println("The Thread printing Alphabets: " + ch);

        }
    }

}

public class Mainn {
    public static void main(String[] args) {

        AlphabetThreads a1 = new AlphabetThreads();
        a1.start();

    }
}