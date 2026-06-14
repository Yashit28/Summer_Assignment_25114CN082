// Q4= Write a program to Find duplicates in array

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
       
        int[] arr = new int[num];
        boolean hasDuplicate = false;
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for ( int i = 0 ; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break;
                }
               
                
            }
            if (hasDuplicate) {
                break;
        }
        }
        if (hasDuplicate) {
            System.out.println("Duplicate element found.");
        } else {
            System.out.println("No duplicate element found.");
        }
    }
}