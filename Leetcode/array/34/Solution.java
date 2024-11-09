class Solution {
    public int[] searchRange(int[] n, int t) {
        int a[] = new int[2];
        int d = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == t) {
                a[0] = i;
                d++;
                break;

            }

        }
        for (int i = n.length - 1; i >= 0; i--) {
            if (n[i] == t) {
                a[1] = i;
                break;

            }

        }
        if (a[1] == 0) {
            a[1] = a[0];
        }
        if (d == 0) {
            a[0] = -1;
            a[1] = -1;
        }

        return a;
    }
}