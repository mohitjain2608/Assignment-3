package Assessment_3;

import java.util.Scanner;

/**
 * Sort the elements in an array in descending order
 */
public class Problem3_14 {
    public static int[] descSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = descSort(arr);

        System.out.println("Elements of array sorted in descending order: ");
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }

}
