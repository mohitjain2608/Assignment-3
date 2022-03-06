package Assessment_3;

import java.util.Scanner;

/**
 * Given on string like "A B ABCABC AB A B "
 * count spaces
 * count duplicates
 * count uniques
 */
public class Problem3_10 {
    public static int countSpaces(String str) {
        int space = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                space++;
            }
        }
        return space;
    }

    public static StringBuilder duplicateChar(String str) {
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
            if (count > 1 && string[i] != '0') {
                dup.append(string[i]);
            }
        }
        return dup;
    }

    public static int uniqueCharacters(String test) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < test.length(); i++) {
            char current = test.charAt(i);
            if (temp.toString().indexOf(current) < 0 && current != ' ') {
                temp.append(current);
            } else {
                temp = new StringBuilder(temp.toString().replace(String.valueOf(current), ""));
            }
        }
        return temp.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("The number of spaces in string: " + countSpaces(str));
        System.out.println("The count of duplicate characters in string: " + duplicateChar(str).length());
        System.out.println("The count of unique characters in string: " + uniqueCharacters(str));
    }
}
