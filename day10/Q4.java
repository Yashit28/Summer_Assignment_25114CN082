// Q4 = Write a program to Print character pyramid. 
//      A 
//     ABA 
//    ABCBA 
//   ABCDCBA 
//  ABCDEDCBA 

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the character pyramid: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < i; k++) {
                System.out.print((char) ('A' + k));
            }
            
            for (int l = i - 2; l >= 0; l--) {
                System.out.print((char) ('A' + l));
            }
            
            System.out.println();
        }

        sc.close();
    }
}