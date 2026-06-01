
// Q1 = Write a program to calculate sum of first N natural number 

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        int Sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find the sum");
        int a = sc.nextInt();

        for (int i = 0; i <= a; i++) {
            Sum = Sum + i;
        }

        System.out.println("Sum = " + Sum);

        sc.close();
    }
}

// Q2 = Write a program to Print multiplication table of a given number 
