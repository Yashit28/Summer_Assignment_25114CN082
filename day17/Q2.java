//Q2 = Write a program to Union of arrays. 

public class Q2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        int[] union = new int[arr1.length + arr2.length];
        int k = 0;

        // Add all elements of first array
        for (int i = 0; i < arr1.length; i++) {
            union[k++] = arr1[i];
        }

        // Add only unique elements from second array
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (arr2[i] == union[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                union[k++] = arr2[i];
            }
        }

        System.out.print("Union: ");
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }
}


