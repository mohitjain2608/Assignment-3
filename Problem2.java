package Assessment_3;

import java.util.Scanner;

/**
 * Write a Java class.
 * Create a method in this class that takes an integer array as the only argument.
 * The method should process this array and return the 3rd largest number in the array. For example, if
 * the array contains the numbers {10, 2, 5, 4, 6, 17, 11, 22} then the method should print the number 11 and also return the same.
 */
public class Problem2 {
    public static int maxThird(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 3];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The third largest element in the array is: " + maxThird(arr));
    }
}

