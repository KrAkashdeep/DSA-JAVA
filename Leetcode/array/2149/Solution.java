class Solution {
    public int[] rearrangeArray(int[] a) {

        // Write your code here.
        int e = 0;
        int f = 0;
        int c[] = new int[a.length / 2];
        int d[] = new int[a.length / 2];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                c[e] = a[i];
                e++;
            }
            if (a[i] < 0) {
                d[f] = a[i];
                f++;
            }
        }
        e = 0;
        f = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                a[i] = c[e];
                e++;
            }
            if (i % 2 != 0) {
                a[i] = d[f];
                f++;
            }
        }
        return a;

    }
}