// Q3 = Write a program to Find factorial of a number

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int a = sc.nextInt();
        int fac = 1 ;
        
        for (int i = 1; i <=a; i++) {
            fac=fac*i;
            
        }
        System.out.println(fac);
        sc.close();
    }
    
}
