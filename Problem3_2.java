package Assessment_3;

import java.util.Scanner;

/**
 * Code to Display no of unique characters in string
 */
public class Problem3_2 {
    public static int uniqueCharacters(String test) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < test.length(); i++) {
            char current = test.charAt(i);
            if (temp.toString().indexOf(current) < 0) {
                temp.append(current);
            } else {
                temp = new StringBuilder(temp.toString().replace(String.valueOf(current), ""));
            }
        }

        return temp.length();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an string:");
        String str = sc.nextLine();
        System.out.println("The count of uniques characters is: " + uniqueCharacters(str));
    }
}
