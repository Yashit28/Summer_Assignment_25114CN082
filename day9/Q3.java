//Q3 = Write a program to Print repeated character pattern. 

//      A 
//      BB 
//      CCC 
//      DDDD 
//      EEEEE 

public class Q3 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}