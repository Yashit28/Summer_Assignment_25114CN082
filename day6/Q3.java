//Q3 = Write a program to Count set bits in a number

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num > 0) {
            count += num & 1; // Check if the last bit is 1
            num >>= 1;        // Right shift by 1
        }

        System.out.println("Number of set bits: " + count);

        sc.close();
    }
}