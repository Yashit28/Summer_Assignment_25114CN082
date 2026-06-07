//Q2 = Write a program to Recursive Fibonacci

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = fibonacci(num);
        System.out.println("Fibonacci of " + num + " is: " + result);
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; 
        } else if (n == 1) {
            return 1; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
}
