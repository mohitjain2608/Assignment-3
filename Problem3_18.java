package Assessment_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Delete an element in an array at position = x, remaining elements should be pushed to the left
 */
public class Problem3_18 {

    public static int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0
                || index >= arr.length) {
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter index to be removed:");
        int index = sc.nextInt();
        arr = removeTheElement(arr, index);
        System.out.println("Resultant Array: "
                + Arrays.toString(arr));
    }
}
