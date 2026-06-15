// Q2 = Write a program to Rotate array left.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of positions to rotate left: ");
        int d = sc.nextInt();
        d = d % n; // Handle cases where d is greater than n
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArr[i] = arr[(i + d) % n];
        }
        System.out.println("Rotated array:");
        for (int num = 0; num < rotatedArr.length; num++) {
            System.out.print(rotatedArr[num] + " ");
        }
        sc.close();
    }
}
