//Q4 = Write a program to Print Armstrong numbers in a range

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit of the range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper limit of the range: ");
        int upper = sc.nextInt();
        
        System.out.println("Armstrong numbers in the range " + lower + " to " + upper + ":");
        for (int num = lower; num <= upper; num++) {
            int originalNum = num;
            int sum = 0;
            int digits = String.valueOf(num).length();
            
            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }
            
            if (sum == originalNum) {
                System.out.println(originalNum);
            }
        }
        
        sc.close();
    }
}
