// Q2 = Write a program to Reverse a number. 

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;

        while (num != 0) {
            int a = num%10 ;
            reversed = reversed * 10 + a ;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
