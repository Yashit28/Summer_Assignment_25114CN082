// Q3 = Write a program to Write function for Fibonacci.


import java.util.Scanner;

public class Q3 {

    public static void fibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    }
}

