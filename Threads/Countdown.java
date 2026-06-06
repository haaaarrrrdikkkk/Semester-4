package Threads;

class CountdownThread extends Thread {
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println(e);

            }
        }

    }

}

public class Countdown {
    public static void main(String[] args) {
        CountdownThread n = new CountdownThread();
        n.start();

    }

}