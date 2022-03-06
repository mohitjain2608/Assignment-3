package Assessment_3;

import java.util.Scanner;

/**
 * How to do factorial of a given number
 */
public class Problem3_7 {
    public static int fact(int n) {

        int i, fact = 1;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is: " + fact(n));
    }
}
