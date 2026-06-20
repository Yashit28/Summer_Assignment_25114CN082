// Q1 = Write a program to Multiply matrices.

import java.util.*;

public class Q1 {
    public static void main(String[] args){     
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows of first matrix");
    int r1 = sc.nextInt();
    System.out.println("enter number of columns of first matrix");
    int c1 = sc.nextInt();
    int[][] a = new int[r1][c1];

    System.out.println("Enter number of rows of second matrix");
    int r2 = sc.nextInt();
    System.out.println("enter number of columns of second matrix");
    int c2 = sc.nextInt();
    int[][] b = new int[r2][c2];

    System.out.println("Enter elements of first matrix");
    for(int i = 0 ; i < r1 ; i ++ ){
        for(int j = 0 ; j < c1 ; j++){
            a[i][j] = sc.nextInt();
        }

    }
    
    System.out.println("Enter elements of second matrix");
    for(int i = 0 ; i < r2 ; i ++ ){
        for(int j = 0 ; j < c2 ; j++){
            b[i][j] = sc.nextInt();
        }

    }
    if (c1!= r2){
        System.out.println("Multipliation of matrix is not possible");
    }

    int[][] c = new int[r1][c2];
    for(int i = 0 ; i < r1 ; i++){
       for(int j = 0 ; j < c2 ; j++){
        for(int k = 0 ; k < c1 ; k++){

        
         c[i][j] += a[i][k]*b[k][j];
        }
       }

    }

    System.out.println("Resultant matrix is :");
     for(int i = 0 ; i < r1 ; i++){
       for(int j = 0 ; j < c2 ; j++){
        System.out.print(c[i][j] + " ");

       }
       System.out.println();
    }




sc.close();

}
}