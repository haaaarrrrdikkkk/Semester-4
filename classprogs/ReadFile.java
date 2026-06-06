package classprogs;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("Student.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                System.out.println(line);

            }
            sc.close();

        } catch (Exception e) {
            System.out.println("File not found!");

        }
    }
}
