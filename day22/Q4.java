// Q4 = Write a program to Remove spaces from string. 

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove all spaces
        String result = str.replace(" ", "");

        System.out.println("String after removing spaces: " + result);

        sc.close();
    }
}