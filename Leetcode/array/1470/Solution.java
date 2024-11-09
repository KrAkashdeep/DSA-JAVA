class Solution {
    public int[] shuffle(int[] a, int n) {
        int b[] = new int[n];
        int c[] = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        int d = 0;
        for (int i = n; i < a.length; i++) {
            c[d] = a[i];
            d++;
        }
        d = 0;
        int e = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                a[i] = b[d];
                d++;
            } else {
                a[i] = c[e];
                e++;
            }
        }
        return a;
    }
}