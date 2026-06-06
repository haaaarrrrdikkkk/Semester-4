package Threads;

import java.util.Scanner;

public class arrfinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array Length");
        int arrlen = scanner.nextInt();

        int[] arr = new int[arrlen];
        System.out.println("Enter" + arrlen + "Elements : ");
        for (int i = 0; i < arrlen; i++) {
            System.out.println("Element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();

        }
        System.out.println("Enter the index of the element to be found : ");
        int search_index = scanner.nextInt();

        try {
            int number = arr[search_index];
            System.out.println("Element at the entered Index : " + number);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index entered, try finding elements within the array! ");

        } finally {
            System.out.println("Operation Finished !!");

        }

        scanner.close();
    }

}
