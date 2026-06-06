import java.util.Scanner;

class Number {
    int val;

    // Constructor to set the number
    Number(int val) {
        this.val = val;
    }

    // Member function to swap values
    void swap(Number extra) {
        int temp = this.val;
        this.val = extra.val;
        extra.val = temp;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two objects
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of num1 : ");
        int a = sc.nextInt();
        System.out.println("Enter value of num2: ");
        int b = sc.nextInt();

        Number num1 = new Number(a);
        Number num2 = new Number(b);

        // Swap them
        num1.swap(num2);

        // Print results
        System.out.println("num1: " + num1.val);
        System.out.println("num2: " + num2.val);
    }
}