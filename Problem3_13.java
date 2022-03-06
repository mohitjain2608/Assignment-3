package Assessment_3;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Delete duplicates in an array
 */
public class Problem3_13 {
    public static void removeDuplicates(int[] a) {
        LinkedHashSet<Integer> set
                = new LinkedHashSet<Integer>();
        for (int j : a) set.add(j);
        System.out.print("Array after removing duplicate values: \n" + set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        removeDuplicates(a);
    }


}


