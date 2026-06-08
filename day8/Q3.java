// Q3 = Write a program to Print character triangle. 
//       A 
//       AB 
//       ABC 
//       ABCD 
//       ABCDE

public class Q3 {
    public static void main(String[] args) {
        
      
      

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }
        
    }
}
