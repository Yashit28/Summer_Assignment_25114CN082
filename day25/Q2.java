// Q2 = Write a program to Find common characters in strings. 

public class Q2 {
    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "gaming";

        System.out.print("Common characters: ");

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (str2.indexOf(ch) != -1 && str1.indexOf(ch) == i) {
                System.out.print(ch + " ");
            }
        }
    }
}
