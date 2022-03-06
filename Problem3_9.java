package Assessment_3;

import java.util.Scanner;

/**
 * Write a Regex for email format abc@gmail.com
 */
public class Problem3_9 {
    public static boolean verifyEmail(String str) {
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        return str.matches(regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email:");
        String email = sc.next();
        boolean res = verifyEmail(email);
        if (res)
            System.out.println("The email-id is valid");
        else
            System.out.println("The email-id is invalid");
    }
}
