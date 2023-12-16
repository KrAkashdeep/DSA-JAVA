public class Solution {
    public static int traffic(int n, int m, int[] v) {
        // Write your code here.
        int c = 0;

        for (int i = 0; i < n; i++) {

            if (v[i] == 0 && m != 0) {
                v[i] = 1;
                m--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (v[i] == 1) {
                c++;
            } else {
                break;
            }
        }
        return c;

    }
}

// consecutive 1