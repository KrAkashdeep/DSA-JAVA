import java.util.*;

public class Solution {
    // public static int[] getFrequencies(int []v) {
    // Write Your Code Here

    // }
    public static void main(String[] arg) {
        int b[] = { 11, 13, 3, 14, 17, 3, 7, 9, 1, 11, 9, 15, 5, 2, 2, 3 };

        Map<Integer, Integer> hs = new HashMap<>();
        int a[] = new int[2];
        for (int i = 0; i < b.length; i++) {
            int k = b[i];
            int fr = 0;
            if (hs.containsKey(k))
                fr = hs.get(k);
            fr++;
            hs.put(k, fr);
        }
        // int max = (Collections.max(hs.values()));
        // int min = (Collections.min(hs.values()));
        int maxF = 0;
        int minF = b.length;
        int max = 0, min = 0;
        for (Map.Entry<Integer, Integer> e : hs.entrySet()) {
            int c = e.getValue();
            int el = e.getKey();

            if (c > maxF) {
                max = el;
                maxF = c;
            }
            if (c < minF) {
                min = el;
                minF = c;
            }
        }
        // a[1] = max;
        // a[0] = min;
        // // return a;
        System.out.println(max);
        System.out.println(min);

    }
}