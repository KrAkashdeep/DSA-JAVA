public class Solution {
    public static int isSorted(int n, int[] a) {
        // Write your code here.
        int s = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] <= a[i + 1]) {
                s = 1;
            } else {

                return 0;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int a[] = { 1, 5, 23, 23, 33 };
        System.out.println(isSorted(5, a));
    }
}