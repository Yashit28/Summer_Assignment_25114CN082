//Q3  = Write a program to Print number pyramid. 
//   1 
//  121 
// 12321 
//1234321 
//123454321 

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the number pyramid: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
          
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
           
            System.out.println();
        }

        sc.close();
    }
}