//Q4 = Write a program to Write function to find factorial.
 

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial  ");
        int n = sc.nextInt();
        int result = Factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static int Factorial(int num)
    {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * Factorial(num - 1);
        }
}
}