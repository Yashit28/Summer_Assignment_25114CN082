//Q3 = Write a program to Find product of digits

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = sc.nextInt();
         int product = 1 ;
         while(num!=0){
            int a = num%10;
            product = product *a ;
            num = num/10;
                 }
                 System.out.println("product is "+product);
                 sc.close();
    }
    
}
