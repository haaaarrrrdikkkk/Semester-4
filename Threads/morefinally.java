package Threads;

import java.util.Scanner;

public class morefinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerator : ");
        int num = scanner.nextInt();
        System.out.println("Enter the denominator : ");
        int den = scanner.nextInt();

        try {
            int division = num / den;
            System.out.println("The quotient of the provided numbers : " + division);

        } catch (ArithmeticException e) {
            System.out.println("Divison by zero requested, unable to process!");

        } finally {
            System.out.println("Operation Over!");

        }

        scanner.close();

    }
}
