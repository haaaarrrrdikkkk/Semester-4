package Threads;

import java.util.Scanner;

class Voter {

    void checkVote(int age) throws ArithmeticException {

        if (age < 18) {
            throw new ArithmeticException();
        }

        System.out.println("Eligible to Vote");
    }
}

public class Voting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Age : ");
        int age = scanner.nextInt();

        Voter v = new Voter();

        try {

            v.checkVote(age);

        }

        catch (ArithmeticException e) {

            System.out.println("Not Eligible to Vote!");

        }

        finally {

            System.out.println("Verification Completed!");

        }

        scanner.close();
    }
}