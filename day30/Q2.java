// Q2 = Write a program to Create mini library system. 

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] titles = new String[n];
        String[] authors = new String[n];
        int[] years = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            titles[i] = scanner.nextLine();
            System.out.print("Author: ");
            authors[i] = scanner.nextLine();
            System.out.print("Year of Publication: ");
            years[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        }

        System.out.println("\nLibrary Records:");
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Title: " + titles[i]);
            System.out.println("Author: " + authors[i]);
            System.out.println("Year of Publication: " + years[i]);
            System.out.println();
        }

        scanner.close();
    }
}
