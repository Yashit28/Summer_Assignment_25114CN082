// Q4 = Write a program to Move zeroes to end.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0; // Count of non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // Move non-zero element to the front
            }
        }
        while (count < n) {
            arr[count++] = 0; // Fill remaining positions with zeroes
        }
        System.out.println("Array after moving zeroes to end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}