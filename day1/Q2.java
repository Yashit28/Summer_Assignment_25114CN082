// Q2 = Write a program to Print multiplication table of a given number 




import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
      

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print their table ");
        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            
             System.out.println( a * i );
        }
       

      sc.close();
        

    }
    
}
