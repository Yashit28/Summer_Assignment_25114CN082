//Q3 = Write a program to Find pair with given sum in an array.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int targetSum = sc.nextInt();
        boolean pairFound = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    pairFound = true;
                }
            }
        }
        if (!pairFound) {
            System.out.println("No pair found with the given sum.");
        }
        sc.close();
    }
}