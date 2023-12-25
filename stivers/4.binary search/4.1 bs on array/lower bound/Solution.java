public class Solution {
    public static int lowerBound(int[] a, int n, int x) {
        int lb = 0;

        while (lb < n) {

            if (x > a[lb])
                lb++;
            else
                return lb;
        }

        return lb;
    }
}