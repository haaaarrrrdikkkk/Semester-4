package Threads;

import java.util.Scanner;

public class bifreverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String word = scanner.nextLine();

        int word_length = word.length();

        String new_string = "";

        for (int i = word_length - 1; i >= 0; i--) {

            new_string = new_string + word.charAt(i);

        }
        System.out.println("Reversed String : " + new_string);

        scanner.close();

    }

}
