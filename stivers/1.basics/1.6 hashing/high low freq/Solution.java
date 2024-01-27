import java.util.*;

public class Solution {
    // public static int[] getFrequencies(int []v) {
    // Write Your Code Here

    // }
    public static void main(String[] arg) {
        int b[] = { 12, 17, 16 };
        // Arrays.sort(b);
        Map<Integer, Integer> hs = new LinkedHashMap<>();
        // int a[] = new int[2];
        for (int i = 0; i < b.length; i++) {
            int k = b[i];
            int fr = 0;
            if (hs.containsKey(k))
                fr = hs.get(k);
            fr++;
            hs.put(k, fr);
        }
        System.out.println(hs);
        // int max = (Collections.max(hs.values()));
        // int min = (Collections.min(hs.values()));
        // int maxF = 0;
        // int minF = b.length;
        // int max = 0, min = 0;
        // for (Map.Entry<Integer, Integer> e : hs.entrySet()) {
        // int c = e.getValue();
        // int el = e.getKey();

        // if (c > maxF) {
        // max = el;
        // maxF = c;
        // }
        // if (c < minF) {
        // min = el;
        // minF = c;
        // }
        // }
        // a[1] = max;
        // a[0] = min;
        // // return a;
        // System.out.println(max);
        // System.out.println(min);

    }
}