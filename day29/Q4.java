// Q4 = Write a program to Create inventory management system.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] itemId = new int[10];
        String[] itemName = new String[10];
        int[] quantity = new int[10];
        double[] price = new double[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Search Item");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < 10) {
                        System.out.print("Enter Item ID: ");
                        itemId[count] = sc.nextInt();

                        sc.nextLine(); // Consume newline

                        System.out.print("Enter Item Name: ");
                        itemName[count] = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        quantity[count] = sc.nextInt();

                        System.out.print("Enter Price: ");
                        price[count] = sc.nextDouble();

                        count++;
                        System.out.println("Item added successfully.");
                    } else {
                        System.out.println("Inventory is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No items in inventory.");
                    } else {
                        System.out.println("\nID\tName\t\tQty\tPrice");
                        for (int i = 0; i < count; i++) {
                            System.out.println(itemId[i] + "\t" +
                                    itemName[i] + "\t\t" +
                                    quantity[i] + "\t" +
                                    price[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Item ID to search: ");
                    int id = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (itemId[i] == id) {
                            System.out.println("Item Found:");
                            System.out.println("ID: " + itemId[i]);
                            System.out.println("Name: " + itemName[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            System.out.println("Price: " + price[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
 