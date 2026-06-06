import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to be checked : ");
        int n = in.nextInt();

        if (n == 0) {
            System.out.println("Entered Number is Zero!");
        } else if (n % 2 == 0) {
            System.out.println("Even Number!");

        } else if (n % 2 != 0) {
            System.out.println("Odd Number!");

        }
    }
}
