//Q2 = Write a program to Find sum and average of array.


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0 ;
        int[] arr = new int[num];
       
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
                sum += arr[i];
            
        }
        System.out.println("The elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
      
        System.out.println("\nThe sum of the elements in the array is: " + sum);
        double average = (double) sum / arr.length;
        System.out.println("The average of the elements in the array is: " + average);
    }
}
