package Assessment_3;

import java.util.Scanner;

/**
 * Check if a Given String is Palindrome
 */
public class Problem3_15 {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        if (isPalindrome(str))
            System.out.print("Yes the given string is a palindrome");
        else
            System.out.print("No the given string is not a palindrome");
    }
}

