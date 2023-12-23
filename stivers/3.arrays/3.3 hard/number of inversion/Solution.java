public class Solution {
    public static int numberOfInversions(int[] a, int n) {
        // Write your code here.
        int c = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i < j && a[i] > a[j]) {
                    c++;
                    max = Math.max(max, c);
                }
            }
        }
        return max;
    }
}
// partially accepted
