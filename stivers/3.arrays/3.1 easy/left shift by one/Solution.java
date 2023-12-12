import java.util.*;
import java.io.*;

public class Solution {

    static int[] rotateArray(int[] a, int n) {
        // Write your code here.
        int b[] = new int[n];
        int d = 0;
        int temp = a[0];
        for (int i = 1; i < n; i++) {
            b[d] = a[i];
            d++;

        }
        b[n - 1] = temp;
        return b;

    }
}