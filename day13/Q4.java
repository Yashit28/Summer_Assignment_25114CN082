// Q4 = Write a program to Count even and odd elements in an array.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int[] arr = new int[num];
       
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
      
        System.out.println("\nThe number of even elements in the array is: " + evenCount);
        System.out.println("The number of odd elements in the array is: " + oddCount);
    }
}

