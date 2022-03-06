package Assessment_3;

import java.util.Scanner;

/**
 * Find no of spaces in the given string
 */
public class Problem3_1 {

    public static void main(String[] args) {
        int space = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String  ");
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                space++;
            }
        }
        System.out.println("Total white space : " + space);
    }
}
