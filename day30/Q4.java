// Q4 = Write a program to Develop complete mini project using arrays, strings and functions. 


import java.util.Scanner;

public class Q4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of records: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] names = new String[n];
        int[] ages = new int[n];
        String[] courses = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for record " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Course: ");
            courses[i] = scanner.nextLine();
        }

        displayRecords(names, ages, courses);
        scanner.close();
    }

    static void displayRecords(String[] names, int[] ages, String[] courses) {
        System.out.println("\nRecords:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Record " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Course: " + courses[i]);
            System.out.println();
        }
    }
}

