package Threads;

import java.util.Scanner;

public class checkmore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Text : ");
        String line = scanner.nextLine();

        int letter = 0;
        int numerical_digit = 0;
        int special_character = 0;

        int line_chars = line.length();

        for (int i = 0; i < line_chars; i++) {
            char check = line.charAt(i);

            if (Character.isLetter(check)) {
                letter++;
            } else if (Character.isDigit(check)) {
                numerical_digit++;

            } else {
                special_character++;

            }
        }
        System.out.println("Total Number of Alphabets :  : " + letter);
        System.out.println("Total Number of Digit : " + numerical_digit);
        System.out.println("Total Number of Special characters : " + special_character);
        scanner.close();

    }

}
