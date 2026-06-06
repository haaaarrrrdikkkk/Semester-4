package Threads;

import java.util.Scanner;

public class vowelscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter the String whose vowels are to be counted : ");
        String word = scanner.nextLine();

        String new_word = word.toLowerCase();

        for (int i = 0; i < new_word.length(); i++) {
            char check = new_word.charAt(i);
            if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
                count += 1;
            }

        }
        System.out.println("Total Number of Vowels : " + count);
        scanner.close();
    }
}
