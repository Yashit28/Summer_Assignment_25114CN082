//Q2 = Write a program to Write function to find maximum


import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number  ");
        int n = sc.nextInt();
        System.out.print("Enter the second number  ");
        int m = sc.nextInt();
        int result = Maximum(n, m);
        System.out.println("The maximum number is  " + result);
       
    }
   
    public static int Maximum(int a, int b) {
        if (a > b) {
           
            return a;
        } else {
           
            return b;
        }
       
    }


}