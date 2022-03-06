package Assessment_3;

import java.util.Scanner;

/**
 * Code to display duplicate characters in string.
 */
public class Problem3_3 {
    public static String duplicateChar(String str) {
        char[] string = str.toCharArray();
        StringBuilder dup = new StringBuilder();
        int count = 0;

        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = '0';
                }
            }
            if (count > 1 && string[i] != '0')
                dup.append(string[i]).append(" ");
        }
        return dup.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("The duplicate characters in string are: " + duplicateChar(str));
    }

}
