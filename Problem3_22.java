package Assessment_3;

import java.util.Scanner;

/**
 * Write a function to print pattern in the image
 * 1
 * 3 3
 * 5 5 5
 * 7 7 7 7
 * 9 9 9 9 9
 * 9 9 9 9 9
 * 7 7 7 7
 * 5 5 5
 * 3 3
 * 1
 */
public class Problem3_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++, a = a + 2) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        a = n * 2 - 1;
        for (int i = 5; i >= 1; i--, a = a - 2) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
