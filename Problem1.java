package Assessment_3;

import java.util.Scanner;

/**
 * Write a Java class.
 * Create a method in this class that takes a List of strings as the only argument. Each string in this list will be a single word containing either alphabets a through z or digits 0 through 9 (for example, “abcd”, “Pune”, “623”, “Mumbai”, “10”, etc.
 * The method should print on standard output 2 numbers:
 * a. How many strings in the input array are numbers
 * b. How many strings in the input array are non-numeric.
 */
public class Problem1 {

    public static void countNum(String[] str) {
        int num = 0, nonNum = 0;
        for (String s : str) {
            if (s.matches("-?\\d+(\\.\\d+)?")) {
                num++;
            } else
                nonNum++;
        }
        System.out.println("Count of numeric values in string: " + num);
        System.out.println("Count of non-numeric values in string: " + nonNum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        countNum(strArray);
    }

}
