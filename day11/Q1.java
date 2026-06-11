//Q1 = Write a program to Write function to find sum of two numbers. 

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number  ");
        int n = sc.nextInt();
        System.out.print("Enter the second number  ");
        int m = sc.nextInt();
        int result = Sum(n, m);
        System.out.println("The sum of the two numbers is  " + result);


       
        }

         public static int Sum(int a, int b) {
            return a + b;



       
    }
}