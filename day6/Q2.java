//Q2 = Write a program to Convert binary to decimal

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal equivalent: " + decimal);

        sc.close();
    }
}