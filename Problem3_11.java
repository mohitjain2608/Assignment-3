package Assessment_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Read a file from disk. On each line the 3 word is a city name. Print Unique City names with their counts.
 */
public class Problem3_11 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("A.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String[] arr = new String[4];
        String s;
        int i = 0;
        while ((s = br.readLine()) != null) {
            arr[i] = s;
            i++;
        }
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (String value : arr) {
            String k = (value.split(","))[2];
            if (!hm.containsKey(k)) {
                hm.put(k, 1);
            } else {
                hm.put(k, hm.get(k) + 1);
            }
        }
        System.out.println(hm);
    }
}
