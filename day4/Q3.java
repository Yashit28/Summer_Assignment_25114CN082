//Q3 = Write a program to Check Armstrong number

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = sc.nextInt();
        int c = num ;
        int a ;
        int sum = 0;

      while(num>0){
        a = num%10 ;
        sum = (a*a*a ) + sum ;
        num = num /10 ;

      }
      if (c==sum){
        System.out.println("number is armstrong");
      }
      else{
        System.out.println("not a armstrong number ");
      }
        
        sc.close();
    }
}
