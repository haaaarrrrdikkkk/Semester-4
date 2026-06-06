package Threads;

import java.util.Scanner;

public class pal {
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

        String low_word = word.toLowerCase();
        String reversed_new_string = new_string.toLowerCase();

        if (low_word.equals(reversed_new_string)) {
            System.out.println("Entered word is a palindrome");

        } else {
            System.out.println("Entered word is not a palindrome");

        }

        scanner.close();

    }

}
