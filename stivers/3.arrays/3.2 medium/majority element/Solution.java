import java.util.Arrays;

public class Solution {
    public static int majorityElement(int[] v) {
        // Write your code here
        int c = 1;
        Arrays.sort(v);
        while (c <= v.length / 2) {

            int a = v[0];
            for (int i = 1; i < v.length; i++) {
                if (c >= v.length / 2) {
                    return a;
                }
                if (a == v[i]) {
                    c++;
                } else {
                    a = v[i];
                    c = 1;
                }
            }
        }
        return v[0];

    }
}