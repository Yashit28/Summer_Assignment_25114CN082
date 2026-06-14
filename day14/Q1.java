//Q1 = Write a program to Linear search an element in an array.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
       
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        System.out.print("Enter the element to be searched : ");
        int search = sc.nextInt();
        
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search){
                found = true;
                break;
            }
            
        }
        
        if(found){
            System.out.println("Element found in the array.");
        }else{
            System.out.println("Element not found in the array.");
        }
      
    }
}