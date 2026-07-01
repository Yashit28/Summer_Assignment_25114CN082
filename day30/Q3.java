// Q3 = Write a program to Create mini employee management system. 

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] names = new String[n];
        int[] ages = new int[n];
        String[] departments = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Department: ");
            departments[i] = scanner.nextLine();
        }

        System.out.println("\nEmployee Records:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Department: " + departments[i]);
            System.out.println();
        }

        scanner.close();
    }
}
