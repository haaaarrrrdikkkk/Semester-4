package Threads;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array Length");
        int arrlen = sc.nextInt();

        int[] arr = new int[arrlen];
        System.out.println("Enter" + arrlen + "Elements : ");
        for (int i = 0; i < arrlen; i++) {
            System.out.println("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the index of the element to be found : ");
        int search_index = sc.nextInt();

        try {
            int number = arr[search_index];
            System.out.println("Element at the entered Index : " + number);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index entered, try finding elements within the array! ");

        }

        catch (ArithmeticException e) {
            System.out.println("Entered number is not of the integer type, continue with integer type index number!");

        }
        sc.close();

    }
}
