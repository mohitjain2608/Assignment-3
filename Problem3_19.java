package Assessment_3;

import java.util.Scanner;

/**
 * Print this triangle
 * 1
 * 3 3
 * 5 5 5
 * 7 7 7 7
 * 7 7 7 7
 * 5 5 5
 * 3 3
 * 1
 */
public class Problem3_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int n = sc.nextInt();
        int c = 1;
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= c; j++)
                System.out.print(i + " ");
            System.out.print("\n");
            c++;
        }
        c--;
        for (int i = n - 1; i > 0; i -= 2) {
            for (int j = c; j > 0; j--)
                System.out.print(i + " ");
            System.out.print("\n");
            c--;
        }

    }
}
