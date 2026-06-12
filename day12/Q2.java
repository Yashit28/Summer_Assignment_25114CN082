//Q2 = Write a program to Write function for Armstrong number.

import java.util.Scanner;

public class Q2 {
    public static boolean isArmstrong(int num) {
       int original = num ;
       int sum = 0 ;
       while(num>0){
        int digit = num % 10 ;
        sum = (digit*digit*digit) + sum ;
        num = num / 10 ;
       }
       return original == sum ;
    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        sc.close();
    }
}
