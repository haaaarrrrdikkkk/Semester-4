package Threads;

class AlphabetThread extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'I'; ch++) {
            System.out.println(ch);

        }

    }

}

class NumberThread extends Thread {
    public void run() {
        for (int i = 0; i <= 9; i++) {
            System.out.println(i);

        }

    }
}

public class Main2Threads {
    public static void main(String[] args) {
        NumberThread n = new NumberThread();
        AlphabetThread a = new AlphabetThread();

        n.start();
        a.start();

    }
}