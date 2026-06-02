//Q4 = Write a program to Check whether a number is palindrome

import java .util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;
        int original = num; 
        while (num != 0) {
            int a = num % 10;
            reversed = reversed * 10 + a;
            num /= 10;
        }
        if (original == reversed) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
    
}
