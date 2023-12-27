import java.util.Arrays;

public class Solution {
    public static int[] inc(int a[], int x, int i) {
        if (x >= 1) {
            a[i] = x;
            inc(a, x - 1, i + 1);
        }
        return a;
    }

    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] a = new int[x];
        inc(a, x, 0);

        return a;

    }
}
