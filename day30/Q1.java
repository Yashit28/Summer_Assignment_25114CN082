// Q1 = Write a program to Create student record system using arrays and strings. 


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] names = new String[n];
        int[] ages = new int[n];
        String[] courses = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Course: ");
            courses[i] = scanner.nextLine();
        }

        System.out.println("\nStudent Records:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Course: " + courses[i]);
            System.out.println();
        }

        scanner.close();
    }
}