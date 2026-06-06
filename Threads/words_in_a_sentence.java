package Threads;

import java.util.Scanner;

public class words_in_a_sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Sentence : ");
        String sentence = scanner.nextLine();

        System.out.println("Enter word to be searched : ");
        String search_word = scanner.nextLine();

        int occurences = 0;
        String words[] = sentence.split(" ");
        int length_words = words.length;

        for (int i = 0; i < length_words; i++) {
            if (words[i].equalsIgnoreCase(search_word)) {
                occurences++;
            }
        }
        System.out.println("Occurences of Searched Words : " + occurences);

        scanner.close();

    }

}
