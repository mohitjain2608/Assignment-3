package Assessment_3;

import java.util.Scanner;

/**
 * Generate Fibonacci series by recursion, input = number of terms/digits = 7
 */
public class Problem3_16 {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void fibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int count = sc.nextInt();
        System.out.println("The fibonacci series for " + count + " is :");
        System.out.print(n1 + " " + n2);
        fibonacci(count - 2);
    }
}

