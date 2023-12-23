public class Solution {
    public static int team(int[] s, int n) {
        // Write your code here.
        int a = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i < j && s[i] > 2 * s[j]) {
                    a++;
                    max = Math.max(max, a);
                }
            }
        }
        return max;

    }
}
// partially accepted 1case time limit exceed