//Q4 = Write a program to Recursive reverse number

import java.util.Scanner;

public class Q4 {

    
    static int reverse = 0;

    static int reverseNumber(int num) {
        if (num == 0) {
            return reverse;
        }

        reverse = reverse * 10 + (num % 10);
        return reverseNumber(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = reverseNumber(num);

        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}