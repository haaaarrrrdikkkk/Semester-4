package classprogs;

import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {

            FileWriter fw = new FileWriter("Student.txt");
            fw.write("Name: Hardik\n");
            fw.write("Branch: CSE\n");
            fw.write("Semester : 4");

            fw.close();

            System.out.println("Data Written Successfully!");

        } catch (Exception e) {
            System.out.println("Error Occured!");

        }
    }

}
