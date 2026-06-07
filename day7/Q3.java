//Q3 = Write a program to Recursive Fibonacci

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = sumOfDigits(num);
        System.out.println("Sum of digits of " + num + " is: " + result);
        sc.close();
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; 
        }
        return (n % 10) + sumOfDigits(n / 10); 
    }
}
