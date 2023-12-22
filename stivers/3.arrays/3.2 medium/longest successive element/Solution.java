import java.util.Arrays;

public class Solution {
    public static int longestSuccessiveElements(int[] a) {
        // Write your code here.
        Arrays.sort(a);
        int n = a.length;
        int max = Integer.MIN_VALUE;

        int count = 1;

        for (int i = 0; i < n - 1; i++) {

            if (((a[i] - a[i + 1]) == 1) || ((a[i + 1] - a[i]) == 1)) {

                count++;

                max = Math.max(max, count);

            }

            else {

                if (((a[i] - a[i + 1]) == 0) || ((a[i + 1] - a[i]) == 0))

                    continue;

                else

                    count = 1;

            }

        }

        return max;
    }
}