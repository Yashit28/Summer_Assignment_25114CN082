// Q2 = Write a program to Count words in a sentence .

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Remove leading/trailing spaces and split by one or more spaces
        String[] words = sentence.trim().split("\\s+");

        int count = words.length;

        System.out.println("Number of words: " + count);

        sc.close();
    }
}
