// Read, write and Append in the same program
package classprogs;

import java.io.FileWriter;
import java.io.EOFException;
import java.io.File;
import java.util.Scanner;

public class data {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("Data.txt");

            fw.write("Hardik\n");
            fw.write("Java\n");
            fw.write("CSE\n");
            fw.write("Programming");

            fw.close();

            System.out.println("File created and Data added Successfully!");

        } catch (Exception e) {
            System.out.println("Error Occurred While Creation or Addition!");
        }

        try {
            FileWriter fw = new FileWriter("Data.txt", true);

            fw.write("\nHi This is the append feature!");
            fw.close();

        } catch (Exception e) {
            System.out.println("Error in Appending File!");

        }
        int lineCount = 0;
        int wordCount = 0;

        try {

            File file = new File("Data.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                String line = sc.nextLine();

                System.out.println(line);

                lineCount++;

                String words[] = line.split(" ");

                wordCount += words.length;
            }

            System.out.println("\nTotal Lines in the file : " + lineCount);
            System.out.println("Total Words in the file : " + wordCount);

            sc.close();
        }

        catch (Exception e) {
            System.out.println("File not found!");
        }

    }
}
