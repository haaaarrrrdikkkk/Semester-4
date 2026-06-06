package Threads;

import java.util.Scanner;

class MultiplicationWork extends Thread {
    int n;

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x" + i + "=" + n * i);

        }
    }
}

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number whose table has to be found : ");
        int n = sc.nextInt();

        MultiplicationWork m = new MultiplicationWork();
        m.n = n;

        m.start();
        sc.close();
    }

}