public class Solution {
    public static int getSingleElement(int[] a) {
        // Write your code here.
        for (int i = 0; i < a.length - 1; i = i + 2) {

            if (a[i] != a[i + 1]) {
                return a[i];

            }

        }
        return a[a.length - 1];

    }
}