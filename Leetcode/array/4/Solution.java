import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        double med = 0;
        int b = n1.length + n2.length;
        int a[] = new int[b];
        for (int i = 0; i < n1.length; i++) {

            a[i] = n1[i];

        }
        int d = n1.length;
        for (int i = 0; i < n2.length; i++) {
            a[d] = n2[i];
            d++;
        }
        // b=b-1;
        Arrays.sort(a);
        if (b % 2 == 0) {
            int f = b / 2;
            med = (double) (a[f] + a[f - 1]) / 2;

        } else {
            int f = b / 2;
            med = a[f];

        }

        return med;
    }
}