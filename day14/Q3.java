//Q3 = Write a program to Second largest element.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int[] arr = new int[num];
       
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        
        System.out.println("The elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("\nThere is no second largest element in the array.");
        } else {
            System.out.println("\nThe second largest element in the array is: " + secondMax);
        }
    }
}