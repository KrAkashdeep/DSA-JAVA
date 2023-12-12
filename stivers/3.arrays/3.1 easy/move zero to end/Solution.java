public class Solution {
    public static int[] moveZeros(int n, int[] a) {
        int b[] = new int[n];
        int c = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                c++;
            } else {
                b[d] = a[i];
                d++;
            }
        }
        while (c != 0) {
            b[d] = 0;
            d++;
            c--;
        }
        return b;

    }

    public static void main(String[] args) {
        int a[] = { 1, 0, 0, 3, 4, 6 };
        System.out.println(moveZeros(5, a));
    }
}

// check how to print the number