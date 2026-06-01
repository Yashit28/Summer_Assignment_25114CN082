//Q4 = Write a program to Count digits in a number

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a number to count their digits ");
        int a = sc.nextInt();
         

        int count = 0 ;

        while(a!=0){
         a = a/10;
         count++;

        }
        System.out.println(count);



    }
    
    
}
