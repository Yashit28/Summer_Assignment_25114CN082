// Q1 =  Write a program to Find missing number in array

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (from 1 to " + (n + 1) + "):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int totalSum = (n + 1) * (n + 2) / 2; 
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        int missingNumber = totalSum - arraySum;
        System.out.println("The missing number is: " + missingNumber);
        sc.close();
    }
}
