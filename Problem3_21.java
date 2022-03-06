package Assessment_3;

import java.util.Scanner;

/**
 * Print Upper and Lower Triangle of Matrix and Find sum of Upper and Lower Triangle of Matrix
 */
public class Problem3_21 {

    public static int lower(int[][] matrix, int row, int col) {
        int i, j, ans = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i < j) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                    ans += matrix[i][j];
                }
            }
            System.out.println();
        }
        return ans;
    }

    public static int upper(int[][] matrix, int row, int col) {
        int i, j, ans = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i > j) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                    ans += matrix[i][j];
                }
            }
            System.out.println();
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int col = sc.nextInt();
        System.out.println("Enter the matrix:");
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Lower triangular matrix: ");
        int sumLower = lower(matrix, row, col);
        System.out.println("Upper triangular matrix: ");
        int sumUpper = upper(matrix, row, col);
        System.out.println("The sum of lower triangular matrix: " + sumLower);
        System.out.println("The sum of upper triangular matrix: " + sumUpper);
    }
}


