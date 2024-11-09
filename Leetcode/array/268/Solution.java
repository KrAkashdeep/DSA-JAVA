import java.util.Arrays;

class Solution {
    public int missingNumber(int[] n) {
        Arrays.sort(n);
        for (int i = 0; i < n.length; i++) {
            if (n[i] != i) {
                return i;
            }
        }
        return n.length;

    }

}