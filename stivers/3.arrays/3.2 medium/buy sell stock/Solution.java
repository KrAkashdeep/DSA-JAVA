public class Solution {
    public static int bestTimeToBuyAndSellStock(int[] p) {
        // Write your code here.
        int low = p[0];
        int max = 0, a = 0;
        for (int i = 1; i < p.length - 1; i++) {
            if (low > p[i]) {
                low = p[i];
                a = i;
            }
        }
        for (int i = a; i < p.length; i++) {
            if (max < (p[i] - low)) {
                max = p[i] - low;
            }
        }
        return max;
    }
}
