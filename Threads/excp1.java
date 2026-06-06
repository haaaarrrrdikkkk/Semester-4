package Threads;

import java.util.Scanner;

public class excp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numerator  : ");
        int n = sc.nextInt();
        System.out.println("Enter the demnominator : ");
        int d = sc.nextInt();
        try {
            int division = n / d;
            System.out.println("The Quotient : " + division);

        } catch (ArithmeticException e) {
            System.out.println("Division by Zero!");

        }
        sc.close();
    }

}
