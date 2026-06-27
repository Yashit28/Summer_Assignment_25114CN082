// Q3 = Write a program to Create salary management system .

import java.util.ArrayList;
import java.util.Scanner;

class Salary {
    int empId;
    String name;
    double basicSalary;
    double hra;
    double da;
    double netSalary;

    Salary(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.hra = basicSalary * 0.20; // 20% HRA
        this.da = basicSalary * 0.10;  // 10% DA
        this.netSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA         : " + hra);
        System.out.println("DA          : " + da);
        System.out.println("Net Salary  : " + netSalary);
        System.out.println("----------------------------");
    }
}

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Salary> salaries = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Search Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double basic = sc.nextDouble();

                    salaries.add(new Salary(id, name, basic));
                    System.out.println("Salary record added successfully.");
                    break;

                case 2:
                    if (salaries.isEmpty()) {
                        System.out.println("No salary records found.");
                    } else {
                        for (Salary s : salaries) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Salary s : salaries) {
                        if (s.empId == searchId) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee record not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
