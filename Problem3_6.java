package Assessment_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a function which accepts list as a parameter , remove duplicates and returns the list
 */
public class Problem3_6 {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> newList = new ArrayList<T>();
        for (T element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println("ArrayList with duplicates removed: "
                + newList);
    }
}



