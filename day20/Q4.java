// Q4 = Write a program to Find column-wise sum. 

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) {
                sum += a[i][j];
            }
            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }
    }
}
