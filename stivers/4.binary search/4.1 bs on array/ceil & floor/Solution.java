import java.util.*;
import java.io.*;

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        int c[] = new int[2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (x >= a[i]) {
                max = Math.max(a[i], max);
            }

            if (x <= a[i]) {
                min = Math.min(a[i], min);
            }
        }
        if (max == Integer.MIN_VALUE)
            max = -1;
        if (min == Integer.MAX_VALUE)
            min = -1;
        c[0] = max;
        c[1] = min;
        return c;
    }

}