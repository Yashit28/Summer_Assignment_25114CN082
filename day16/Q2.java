//Q2 = Write a program to Find maximum frequency element in an array.

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3, 3};

        int maxCount = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Element with maximum frequency: " + maxElement);
        System.out.println("Frequency: " + maxCount);
    }
}