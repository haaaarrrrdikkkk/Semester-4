package Threads;

class GoodMorning extends Thread {
    public void run() {
        System.out.println("Good");
        System.out.println("Morning");

    }
}

class JavaPro extends Thread {
    public void run() {
        System.out.println("Java");
        System.out.println("Programming");

    }

}

public class MainMessage {
    public static void main(String[] args) {
        GoodMorning g = new GoodMorning();
        JavaPro j = new JavaPro();

        g.start();
        j.start();

    }
}