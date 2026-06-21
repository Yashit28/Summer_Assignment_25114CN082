// Q4 = Write a program to Convert lowercase to uppercase.

public class Q4 {
    public static void main(String[] args) {
        String str = "hello";
        String result = "";
        int i = 0;

        while (i < str.length()) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result = result + ch;
            i++;
        }

        System.out.println(result);
    }
}