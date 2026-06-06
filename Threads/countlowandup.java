package Threads;

import java.util.Scanner;

public class countlowandup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Text : ");
        String line = scanner.nextLine();

        int lower = 0;
        int upper = 0;
        int special = 0;

        int line_chars = line.length();

        for (int i = 0; i < line_chars; i++) {
            char check = line.charAt(i);

            if (Character.isLowerCase(check)) {
                lower++;
            } else if (Character.isUpperCase(check)) {
                upper++;

            } else {
                special++;

            }
        }
        System.out.println("Total Number of Lowercase characters : " + lower);
        System.out.println("Total Number of Uppercase characters : " + upper);
        System.out.println("Total Number of Special(Non-lower/Non-Upper) characters : " + special);
    }

}
