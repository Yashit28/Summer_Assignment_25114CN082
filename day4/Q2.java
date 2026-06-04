// Q2 = Write a program to Find nth Fibonacci term

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term number to find in Fibonacci series: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1, nthTerm = 0;
        if (n == 1) {
            nthTerm = a;
        } else if (n == 2) {
            nthTerm = b;
        } else {
            for (int i = 3; i <= n; i++) {
                nthTerm = a + b;
                a = b;
                b = nthTerm;
            }
        }
        
        System.out.println("The " + n + "rd term in Fibonacci series is: " + nthTerm);
        sc.close();
    }
}
