package Threads;

import java.util.Scanner;

public class ageexc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age of the user : ");
        int age = scanner.nextInt();

        try {

            if (age < 0) {
                throw new ArithmeticException();
            }

            System.out.println("Entered Age : " + age);

        }

        catch (ArithmeticException e) {
            System.out.println("Entered Age is Below 0 and hence INVALID!!");
        }

        finally {
            System.out.println("Execution Successfully completed!");
        }

        scanner.close();
    }
}