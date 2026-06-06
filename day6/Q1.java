//Q1 = Write a program to Convert decimal to binary. 

import java.util.Scanner;



public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary equivalent: " + binary);

        sc.close();
    }
}