//Q2 = Write a program to Frequency of an element.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
       
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        System.out.print("Enter the element to find its frequency : ");
        int search = sc.nextInt();
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search){
                count++;
            }
            
        }
        
        System.out.println("Frequency of the element "+search+" is : "+count);
      
    }
}