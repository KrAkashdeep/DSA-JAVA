public class Solution {
    public static int upperBound(int[] a, int x, int n) {
        // Write your code here.
        int lb = 0;

        while (lb < n) {

            if (x < a[lb])
                return lb;
            else
                lb++;
        }

        return lb;
    }
}
