package Assessment_3;

import java.util.Scanner;

/**
 * Pascal’s Triangle : Print
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 */
public class Problem3_20 {

    public static int factorial(int i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int n = sc.nextInt();
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {

                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {

                System.out.print(
                        " "
                                + factorial(i)
                                / (factorial(i - j)
                                * factorial(j)));
            }
            System.out.println();
        }
    }
}

