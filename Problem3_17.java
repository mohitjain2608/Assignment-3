package Assessment_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Insert an element in an array at position = x, remaining elements should be pushed to the right
 */

public class Problem3_17 {

    public static int[] insertX(int n, int[] arr, int x, int pos) {
        int i;
        int[] newarr = new int[n + 1];
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be inserted:");
        int x = sc.nextInt();
        System.out.println("Enter position at which element is to be inserted :");
        int pos = sc.nextInt();
        arr = insertX(n, arr, x, pos);
        System.out.println("\nArray with " + x
                + " inserted at position "
                + pos + ":\n"
                + Arrays.toString(arr));
    }
}
